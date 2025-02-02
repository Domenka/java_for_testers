package manager;

import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {

    public LoginHelper(ApplicationManager manager) {
           super(manager);
    }

    void login(String name, String password, ApplicationManager applicationManager) {
        type(By.name("user"), name);
        type(By.name("pass"), password);
        getClick(By.xpath("//input[@value=\'Login\']"));
    }
}
