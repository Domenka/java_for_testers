import org.junit.jupiter.api.Test;

public class CanDeleteGroupTest extends TestBase {

    @Test
    public void canDeleteGroup() {
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup();
        }
        app.groups().deleteGroup();

    }
}
