package ru.tanya.tests;

import org.testng.annotations.Test;
import ru.tanya.model.GroupData;

/**
 * Created by taty on 16.08.2017.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() throws InterruptedException {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("qwerty", "asdfg", "zxcvb"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnGroupPage();
    }
}
