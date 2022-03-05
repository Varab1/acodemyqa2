package page_object;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocalDriverManager;

import static constans.Products.BELT;

public class CartButton {
    private final WebDriver driver = LocalDriverManager.getInstance();

    private final By cartButton = By.id("site-header-cart" + BELT);



    public void cartButton() {
        WebElement cartButton = driver.findElement(By.id("site-header-cart" + BELT));
        cartButton.click();


    }


}
