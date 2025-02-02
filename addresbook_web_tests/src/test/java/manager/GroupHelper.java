package manager;

import model.GroupData;
import org.openqa.selenium.By;

public class GroupHelper extends HelperBase {

    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void createGroup(GroupData group) {
        openGroupsPage();
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupsPage();
    }

    public void deleteGroup() {
        openGroupsPage();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupsPage();
    }

    public void modifyGroup(GroupData modifiedGroup) {
        openGroupsPage();
        selectGroup();
        initGroupModification();
        fillGroupForm(modifiedGroup);
        submitGroupModification();
        returnToGroupsPage();

    }

    private void fillGroupForm(GroupData group) {
        type(By.name("group_name"), group.name());
        type(By.name("group_header"), group.header());
        type(By.name("group_footer"), group.footer());
    }

    public void openGroupsPage() {
        if (!manager.isElementPresent(By.name("new"))) {
            getClick(By.linkText("groups"));
        }
    }

    public boolean isGroupPresent() {
        openGroupsPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    private void submitGroupCreation() {
        getClick(By.name("submit"));
    }

    private void initGroupCreation() {
        getClick(By.name("new"));
    }

    private void deleteSelectedGroup() {
        getClick(By.name("delete"));
    }

    private void returnToGroupsPage() {
        getClick(By.linkText("group page"));
    }

    private void submitGroupModification() {
        getClick(By.name("update"));
    }

    private void initGroupModification() {
        getClick(By.name("edit"));
    }

    private void selectGroup() {
        getClick(By.name("selected[]"));
    }

}
