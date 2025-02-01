import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    protected static ApplicationManager app;

    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new ApplicationManager();
        }
        app.init();
    }









    /* @BeforeEach
    public void setUp() {
        if (canCreateGroup.driver == null) {
            canCreateGroup.driver = new FirefoxDriver();
            Runtime.getRuntime().addShutdownHook(new Thread(canCreateGroup.driver::quit));
            canCreateGroup.driver.get("http://localhost/addressbook/index.php");
            canCreateGroup.driver.findElement(By.name("user")).sendKeys("admin");
            canCreateGroup.driver.findElement(By.name("pass")).click();
            canCreateGroup.driver.findElement(By.name("pass")).sendKeys("secret");
            canCreateGroup.driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
        }
    } */
}
