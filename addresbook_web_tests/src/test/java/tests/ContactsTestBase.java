package tests;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactsTestBase {

    protected static WebDriver driver;

    protected static void creatingContact() {
      driver.findElement(By.linkText("add new")).click();
      driver.findElement(By.name("firstname")).click();
      driver.findElement(By.name("firstname")).sendKeys("First");
      driver.findElement(By.name("middlename")).click();
      driver.findElement(By.name("middlename")).sendKeys("Middle");
      driver.findElement(By.name("lastname")).click();
      driver.findElement(By.name("lastname")).sendKeys("Last");
      driver.findElement(By.name("nickname")).click();
      driver.findElement(By.name("nickname")).sendKeys("Somebody");
      driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    }

    protected static void deletingContact() {
      driver.findElement(By.id("1")).click();
      driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
      driver.findElement(By.linkText("Logout")).click();
    }

    @BeforeEach
    protected void setUp() {
      if (driver == null) {
        driver = new FirefoxDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
        login();
      }
    }

    protected void login() {
    driver.get("http://localhost/addressbook/index.php");
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
  }

    private boolean isElementPresent(By locator) {
      try {
        driver.findElement(locator);
        return true;
      } catch (NoSuchElementException exception) {
         return false;
      }
    }
}
