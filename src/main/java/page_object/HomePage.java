package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {


    public final By productElements = By.xpath("//ul[contains(@class, 'products')]//li");
    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public List<WebElement> getAllProducts() {

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