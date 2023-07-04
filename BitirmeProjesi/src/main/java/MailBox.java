import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailBox extends BasePage{
    By mailLocator = By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
    By loginButton = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
    public MailBox(WebDriver driver) {
        super(driver);
    }

    public void text(String mail) throws InterruptedException {
        click(loginButton);
        Thread.sleep(1000);
        type(mailLocator, mail);
    }

    public void textt(String mail) throws InterruptedException {
        click(loginButton);
        Thread.sleep(1000);
        type(mailLocator, mail);
    }
}