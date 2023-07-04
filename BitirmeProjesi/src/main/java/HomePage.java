import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    MailBox mailBox;
    PasswordBox passwordBox;
    TabBox tabBox;
    BestSeller bestSeller;
    LoggingOut loggingOut;

    By homePageLocator = new By.ByXPath("//div[@class='menu top login']//a[@class='common-sprite']");
    By tabPageLocator = new By.ByXPath("/html[1]/body[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/a[1]/strong[1]");
    By returnHomePageLocator = new By.ByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/a[1]/img[1]");
    By areWeOnHomePageLocator = new By.ByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]");

    By loginScreenLocator = new By.ByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
    By cartButton = By.id("cart");
    By cartButtonn = By.id("js-cart");

    public HomePage(WebDriver driver) {
        super(driver);
        mailBox = new MailBox(driver);
        passwordBox = new PasswordBox(driver);
        tabBox = new TabBox(driver);
        bestSeller = new BestSeller(driver);
        loggingOut = new LoggingOut(driver);
    }

    public MailBox mailBox() {
        return this.mailBox;
    }

    public PasswordBox passwordBox() {
        return this.passwordBox;
    }

    public boolean checkIfLogged() {
        return isDisplayed(homePageLocator);
    }

    public TabBox tabBox() {
        return this.tabBox;
    }

    public boolean isOnTabBox() {
        return isDisplayed(tabPageLocator);
    }

    public BestSeller bestSeller() {
        return this.bestSeller;
    }

    public boolean goBackHomePage() throws InterruptedException {
        click(returnHomePageLocator);
        Thread.sleep(1000);
        return isDisplayed(areWeOnHomePageLocator);
    }

    public LoggingOut loggingOut() {
        return this.loggingOut;
    }

    public boolean areWeLoggedOut() {
        return isDisplayed(loginScreenLocator);
    }

    public void goToCart() throws InterruptedException {
        click(cartButton);
        Thread.sleep(1000);
        click(cartButtonn);
        Thread.sleep(1000);
    }
}