package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private final WebDriver driver = LocalDriverManager.getInstance();
    public final By productElements = By.xpath("//ul[contains(@class, 'products')]//li");

    public final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.getProperties().getProperty("explicit.wait"))));


    public List<WebElement> getAllProducts() {
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(productElements));
        return driver.findElements(productElements);
    }

    public void clickOnProduct(String productName) {
        for (WebElement product : getAllProducts()) {
            if (product.getText().contains(productName)) {
                product.click();
                break;
            }
        }
    }

    public void addToCartSpecificProduct(String productName) {
        for (WebElement product : getAllProducts()) {
            if (product.getText().contains(productName)) {
                product.findElement(By.xpath(".//a[text()='Add to cart']")).click();
            }
        }
    }



}