import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By productDetailOptionLocator = new By.ByXPath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[4]/a[1]");
    By addProductToCartLocator = By.id("button-cart");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(productDetailOptionLocator);
    }

    public void addToCart() throws InterruptedException {
        click(addProductToCartLocator);
        Thread.sleep(1000);
    }
}