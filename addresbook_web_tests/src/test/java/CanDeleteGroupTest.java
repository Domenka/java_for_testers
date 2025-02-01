import org.junit.jupiter.api.Test;

public class CanDeleteGroupTest extends TestBase {

    @Test
    public void canDeleteGroup() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup();
        }
        deleteGroup();

    }
}
