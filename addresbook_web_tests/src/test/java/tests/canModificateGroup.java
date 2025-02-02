package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;
import tests.TestBase;

public class canModificateGroup extends TestBase {
    @Test
    void canModifyGroup () {
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup(new GroupData());
        }

        app.groups().modifyGroup(new GroupData().withName("modified name"));

    }


}
