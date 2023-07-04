import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSeller extends BasePage{
    By bestSellerLocator = new By.ByXPath("/html[1]/body[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/strong[1]");
    public BestSeller(WebDriver driver) {
        super(driver);
    }

    public void clickBestSeller() throws InterruptedException {
        click(bestSellerLocator);
        Thread.sleep(1000);

    }
}