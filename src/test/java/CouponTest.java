import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.*;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constans.Colors.BLUE;
import static constans.Messages.COUPON_IS_APPLIED;
import static constans.Products.HOODIE;


@Slf4j

public class CouponTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartButton cartButton = new CartButton();
    CartPage cartPage = new CartPage();

    @BeforeEach
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

        log.info("Step 7: User enter code");
        cartPage.enterCoupon("easy_discount");

        log.info("Step 8: User apply Coupon");
        cartPage.applyCoupon();

        log.info("Step 9: User sees the message - Coupon code applied successfully ");
        cartPage.checkSuccessMessage(COUPON_IS_APPLIED);

        log.info("Step 10:User enter second code");
        cartPage.enterCoupon("additional_discount");

        log.info("Step 11: User apply second Coupon");
        cartPage.applyCoupon();

        log.info("Step 12: User sees the message - Coupon code applied successfully");
        cartPage.checkSuccessMessage(COUPON_IS_APPLIED);

    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}
