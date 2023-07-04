import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    By checkCartPage = new By.ByXPath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/td[8]/a[1]");
    By finishLocator = new By.ByXPath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/a[2]");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCartPage() {
        return isDisplayed(checkCartPage);
    }

    public void checkTrueProductAdded() {
        WebElement checkNameElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/a[1]"));
        String resultName = checkNameElement.getText();
        System.out.println(resultName);
    }

    public boolean checkTrueProductAddedd() {
        return isDisplayed(finishLocator);
    }
}