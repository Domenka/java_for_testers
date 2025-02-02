package tests;

import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    protected static ApplicationManager app;

    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new ApplicationManager();
        }
        app.init(System.getProperty("browser", "chrome"));
    }









    /* @BeforeEach
    public void setUp() {
        if (tests.canCreateGroup.driver == null) {
            tests.canCreateGroup.driver = new FirefoxDriver();
            Runtime.getRuntime().addShutdownHook(new Thread(tests.canCreateGroup.driver::quit));
            tests.canCreateGroup.driver.get("http://localhost/addressbook/index.php");
            tests.canCreateGroup.driver.findElement(By.name("user")).sendKeys("admin");
            tests.canCreateGroup.driver.findElement(By.name("pass")).click();
            tests.canCreateGroup.driver.findElement(By.name("pass")).sendKeys("secret");
            tests.canCreateGroup.driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
        }
    } */
}
