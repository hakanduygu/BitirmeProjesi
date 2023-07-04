import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSteps extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void login() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.mailBox().text("hakkoman9@hotmail.com");
        homePage.passwordBox().text("SK+4k3!Z3SC6Hs");
        Assertions.assertTrue(homePage.checkIfLogged(),"Giriş başarısız!");

    }
    @Test
    @Order(2)
    public void on_tab() throws InterruptedException {
        homePage.tabBox().tabbing();
        Assertions.assertTrue(homePage.isOnTabBox(),"Çok satan kitaplar kutusunda değilsiniz.");

    }
    @Test
    @Order(3)
    public void go_bestseller_last_10_years() throws InterruptedException {
        homePage.bestSeller().clickBestSeller();
        productsPage = new ProductsPage(driver);
        Assertions.assertTrue(productsPage.isOnProductPage(),"Ürün sayfasında değilsiniz.");

    }
    @Test
    @Order(4)
    public void select_random_product() throws InterruptedException {
        productsPage.selectProduct();
        productDetailPage = new ProductDetailPage(driver);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Ürün detayları sayfasında değilsiniz." );
    }

    @Test
    @Order(5)
    public void add_to_cart() throws InterruptedException {
        WebElement addElement = driver.findElement(By.id("button-cart"));
        addElement.isDisplayed();
        productDetailPage.addToCart();
        WebElement textElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/h2[1]/a[1]"));
        String actualName = textElement.getText();
        System.out.println(actualName);
        Assertions.assertTrue(homePage.goBackHomePage(),"Ürün sepete eklenmedi.");

    }
    @Test
    @Order(6)
    public void log_out() throws InterruptedException {
        homePage.loggingOut().logOut();
        Assertions.assertTrue(homePage.areWeLoggedOut(),"Çıkış yapılmadı.");

    }
    @Test
    @Order(7)
    public void re_login() throws InterruptedException {
        homePage.mailBox().textt("hakkoman9@hotmail.com");
        homePage.passwordBox().textt("SK+4k3!Z3SC6Hs");
        Assertions.assertTrue(homePage.checkIfLogged(),"Giriş başarısız!");

    }
    @Test
    @Order(8)
    public void go_to_cart() throws InterruptedException {
        homePage.goToCart();
        cartPage = new CartPage(driver);
        Assertions.assertTrue(cartPage.isOnCartPage(),"Sepette değilsiniz.");

    }
    @Test
    @Order(9)
    public void verify_product_in_cart(){
        cartPage.checkTrueProductAdded();
        Assertions.assertTrue(cartPage.checkTrueProductAddedd(),"Ürününüz doğru şekilde eklenmemiştir.");
    }
}