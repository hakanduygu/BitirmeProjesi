import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabBox extends BasePage{
    By onTabBox = By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/span[1]");
    public TabBox(WebDriver driver) {
        super(driver);
    }

    public void tabbing() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(onTabBox);
        actions.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(onTabBox));
        Thread.sleep(1000);
    }
}