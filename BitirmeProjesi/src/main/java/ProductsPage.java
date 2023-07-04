import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage{
    By bookOptionsLocator = new By.ByXPath("/html[1]/body[1]/div[5]/div[1]/div[1]/a[2]");
    By selectProductLocator = new By.ByClassName("product-cr");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(bookOptionsLocator);
    }

    public void selectProduct() throws InterruptedException {
        Random rand = new Random();
        int randomBook = rand.nextInt(tumkitaplar().size());
        tumkitaplar().get(randomBook).click();
        Thread.sleep(1000);
    }
    private List<WebElement> tumkitaplar(){
        return findAll(selectProductLocator);
    }
}