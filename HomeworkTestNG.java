import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeworkTestNG {

    WebDriver driver;

    @Test (priority = 1)
    void openBrowser(){
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test (priority = 2)
    void selectitem(){
        System.out.println("Select Computer then Desktop");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
    }

    @Test (priority = 3)
    void addtoCart(){
        System.out.println("Add to Cart");
        driver.findElement(By.id("add-to-cart-button-3")).click();
        driver.findElement(By.id("product_enteredQuantity_3")).sendKeys("1");
    }

    @Test(priority = 4)
    void verify(){
        System.out.println("Verify that items is added in cart");
        driver.findElement(By.className("cart-label")).click();

    }

    @Test (priority = 5)
    void increaseQuantity(){
        System.out.println("Increase quantity of item");
//        driver.findElement(By.name("itemquantity11224")).click();
    }

    @Test (priority = 6)
    void agreeTerms(){
        System.out.println("Agree terms and Conditions and click on checkout");
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }

    @Test (priority = 7)
    void fillBilling(){
        System.out.println("Fill Billing information");
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Disha");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Patel");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("Dishap@yahoo.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Patel & Company");
        driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")).sendKeys("United Kingdom");
        driver.findElement(By.id("BillingNewAddress_StateProvinceId")).sendKeys("Yorkshire");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Huddersfield");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("5 Ever land");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("HD1 7YB");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("0765432987");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[2]")).click();

    }

    @Test (priority = 8)
    void shippingMethod(){
        System.out.println("Shipping Method");
//        driver.findElement(By.cssSelector("#shipping-method-buttons-container > button")).click();

        }

    @Test (priority = 9)
    void paymentMetho() {
        System.out.println("Payment Method");
        driver.findElement(By.name("paymentmethod")).click();
        driver.findElement(By.name("save")).click();
        }



    @Test (priority = 10)
    void paymentinformation(){
        System.out.println("Payment Information");
        driver.findElement(By.xpath("//*[@id=\"CreditCardType\"]")).sendKeys("Visa");
        driver.findElement(By.id("CardholderName")).sendKeys("Ms Disha Patel");
        driver.findElement(By.id("CardNumber")).sendKeys("345 3867 9564");
        driver.findElement(By.id("ExpireMonth")).sendKeys("10");
        driver.findElement(By.id("ExpireYear")).sendKeys("2026");
        driver.findElement(By.id("CardCode")).sendKeys("8764");
        driver.findElement(By.className("button-1 payment-info-next-step-button")).click();
    }


}
