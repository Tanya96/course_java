package ru.tanya;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    
    @Test
    public void testGroupDeletion() throws InterruptedException {
        goToGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnGroupPage();
    }

}
