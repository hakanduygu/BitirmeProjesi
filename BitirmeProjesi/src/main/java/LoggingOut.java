import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoggingOut extends BasePage{
    By logOut = new By.ByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]");
    By logOutPut = new By.ByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[4]/a[1]");
    public LoggingOut(WebDriver driver) {
        super(driver);
    }

    public void logOut() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(logOut);
        actions.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(logOut));
        Thread.sleep(1000);
        click(logOutPut);
    }
}