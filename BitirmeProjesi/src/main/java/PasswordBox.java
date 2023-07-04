import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordBox extends BasePage{
    By passwordLocator = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
    By loginButton2 = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]");
    public PasswordBox(WebDriver driver) {
        super(driver);
    }

    public void text(String password) throws InterruptedException {
        type(passwordLocator,password);
        click(loginButton2);
        Thread.sleep(10000);
    }

    public void textt(String password) throws InterruptedException {
        type(passwordLocator,password);
        click(loginButton2);
        Thread.sleep(10000);
    }
}