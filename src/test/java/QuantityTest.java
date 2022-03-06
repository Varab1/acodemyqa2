import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.CartPage;
import page_object.HeaderPage;
import page_object.HomePage;
import page_object.ProductPage;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constans.Products.BELT;


@Slf4j
public class QuantityTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @BeforeEach
    public void init() {
        log.info("Step 1: User open the Online shop page.");
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));
    }

    @Test
    public void applyCouponCode() {
        log.info("Step 2: User select any product on the main page");
        homePage.clickOnProduct(BELT);

        log.info("Step 3: User adding product to cart");
        productPage.addProductToCart();

        log.info("Step 4: User click cart Button");
        productPage.viewCartButton();

        log.info("Step 5: User changes the quantity of a product in the cart");
        cartPage.checkQuantity(5);

        log.info("Step 6: User clicks button UpdateCart");
        cartPage.updateCart();
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}
