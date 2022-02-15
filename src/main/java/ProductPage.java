import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    private WebDriver driver;

    private final By colorSelection = By.id("pa_color");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectColor(String color) {
        Select Color = new Select(driver.findElement(colorSelection));
        Color.selectByVisibleText(color);
    }
}
