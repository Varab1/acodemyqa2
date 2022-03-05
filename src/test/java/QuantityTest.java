import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.*;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constans.Colors.BLUE;
import static constans.Products.HOODIE;


@Slf4j
public class QuantityTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @BeforeEach       // Инициализация теста.
    public void init() {
        log.info("Step 1: User open the Online shop page.");
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));
    }

    @Test
    public void applyCouponCode() {
        log.info("Step 2: User select any product on the main page");
        homePage.clickOnProduct(HOODIE);

        log.info("Step 3: User select color");
        productPage.selectColor(BLUE);

        log.info("Step 4: User select logo");
        productPage.selectLogo(true);

        log.info("Step 5: User adding product to cart");
        productPage.addProductToCart();

        log.info("Step 6: User click cart Button");
        productPage.viewCartButton();

        log.info("Step 7: User changes the quantity of a product in the cart");
        cartPage.checkQuantity(5);

        log.info("Step 8: User clicks button UpdateCart");
        cartPage.updateCart();
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}
