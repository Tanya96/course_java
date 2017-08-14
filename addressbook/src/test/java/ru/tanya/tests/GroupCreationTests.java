package ru.tanya.tests;

import org.testng.annotations.Test;
import ru.tanya.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
    }

}
