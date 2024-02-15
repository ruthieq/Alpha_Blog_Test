import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AlphaBlogTest {

    //import the selenium webDriver

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void start() throws InterruptedException {
        // locate where the chrome driver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
        //1. open your Chrome browser
        //2. Input your Selenium Demo Page URL (https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        //3. Maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //4. Click on Signup button to open the Signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
    }
        @Test (priority = 0)
        public void negativeLogin() throws InterruptedException {
            //5.Input your username on the username field
            driver.findElement(By.id("user_username")).sendKeys("ru");
            Thread.sleep(5000);
            //6. Locate the email address field and Input an email address on the email field
            driver.findElement(By.id("user_email")).sendKeys("rut@yamail.com");
            Thread.sleep(5000);
            //7.  Locate the password field and input your password on the password field
            driver.findElement(By.id("user_password")).sendKeys("1");
            Thread.sleep(5000);
            //8. Click on the Signup button
            driver.findElement(By.id("submit")).click();
            Thread.sleep(20000);
    }
        @Test (priority = 1)
        public void positiveLogin() throws InterruptedException {
            //9. click on Login
            driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a"));

            Thread.sleep(5000);
            //9.Input your valid email on the email field
            driver.findElement(By.xpath("//*[@id=\"session_email\"]"));
            Thread.sleep(5000);
            //10. Input your password on the password field
            driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
            Thread.sleep(5000);
            //11. Click on the Login button
           driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div/input"));
           Thread.sleep(5000);
           //14. Verify that clicking on users will direct me to the all users page
           driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
           Thread.sleep(5000);
           //10. Click on meaghan on the all users page
           driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
           Thread.sleep(5000);
           //11. Click on "Using Python with Selenium"
           driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
           Thread.sleep(10000);
        }
          @Test (priority = 2)
          public void setup () throws InterruptedException {
          //11. Confirm that user is directed to Login page after log out
          driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
          Thread.sleep(10000);
        }
           @AfterTest
           public void closebrowser(){
           //12. Quit the browser
           driver.quit();

    }

}
