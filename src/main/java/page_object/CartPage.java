package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CartPage {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("implicit.wait"))));

    private final By couponCodeField = By.id("coupon_code");
    private final By applyCouponButton = By.name("apply_coupon");
    private final By successMessage = By.className("woocommerce-message");
    private final By removeButton = By.className("woocommerce-remove-coupon");
    private final By checkQuantity = By.className("qty");
    private final By updateCart = By.name("update_cart");

    public void enterCoupon(String code) {
        wait.until(ExpectedConditions.presenceOfElementLocated(couponCodeField));
        System.out.println(code);
        driver.findElement(couponCodeField).sendKeys(code);
    }
    public void applyCoupon() {
        wait.until(ExpectedConditions.presenceOfElementLocated(applyCouponButton));
        driver.findElement(applyCouponButton).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(applyCouponButton));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//form[contains(@class,'processing')]"))));

    }

    public void checkSuccessMessage(String message) {
        wait.until(ExpectedConditions.presenceOfElementLocated(successMessage));
        assertThat(driver.findElement(successMessage).getText(), equalTo(message));
    }

    public void removeCouponWithJs() {
        wait.until(ExpectedConditions.presenceOfElementLocated(removeButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(removeButton));
    }

    public void checkQuantity(int number) {
        wait.until(ExpectedConditions.presenceOfElementLocated(checkQuantity));
        driver.findElement(checkQuantity).sendKeys(Keys.CONTROL + "a");
        driver.findElement(checkQuantity).sendKeys("5");
    }

    public void updateCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(updateCart));
        driver.findElement(updateCart).click();
    }
}