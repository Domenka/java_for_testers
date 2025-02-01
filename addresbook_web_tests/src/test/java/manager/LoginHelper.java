package manager;

import org.openqa.selenium.By;

public class LoginHelper {

    private final ApplicationManager manager;

    public LoginHelper(ApplicationManager manager) {
           this.manager = manager;
    }

    void login(String name, String password, ApplicationManager applicationManager) {
        manager.driver.findElement(By.name("user")).sendKeys(name);
        manager.driver.findElement(By.name("pass")).sendKeys(password);
        manager.driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }
}
