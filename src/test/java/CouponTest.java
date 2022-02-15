import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.CartButton;
import page_object.HeaderPage;
import page_object.HomePage;

import static constans.Products.BELT;
import static constans.Products.HOODIE;


@Slf4j

public class CouponTest {

    WebDriver driver; // Перед тестом мы инициализируем драйвер. В тесте мы его используем.
    HeaderPage header;
    HomePage homePage;
    CartButton cartButton;
    ProductPage productPage;


    @BeforeEach       // Инициализация теста.
    public void init() {

        driver = new ChromeDriver();
        this.header = new HeaderPage(driver);
        this.homePage = new HomePage(driver);
        this.productPage = new ProductPage(driver);
        this.cartButton = new CartButton(driver);
    }
    @Test
    public void testIfProductInTheCart() {
        log.info("Step 1: User open the Online shop page.");
        driver.get("https://shop.acodemy.lv");
        log.info("Step 2: User select any product on the main page by clicking on Add to card under the product.");
        homePage.addToCartSpecificProduct(BELT);
        log.info("Step 3: User clicks on the Card logo on top of the screen");
        driver.findElement(By.id("site-header-cart")).click();
        log.info("Step 4: User see product in the cart.");


    }

    @Test
    public void applyCouponCode() {
        log.info("Step 1: User open webpage");
        driver.get("https://shop.acodemy.lv");
        log.info("Step 2:User select product by product name" + HOODIE);
        homePage.clickOnProduct("Hoodie");
        log.info("Step 3: User chooses color");
        productPage.selectColor("Green");

    }




    @AfterEach
    public void tearDown() {
        driver.quit(); //Закрывает драйвер.
    }
}
