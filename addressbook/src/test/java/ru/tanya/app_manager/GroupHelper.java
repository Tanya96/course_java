package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tanya.model.GroupData;

/**
 * Created by taty on 14.08.2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnGroupPage() throws InterruptedException {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() throws InterruptedException {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupCreation() throws InterruptedException {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() throws InterruptedException {
        click(By.name("delete"));
    }

    public void selectGroup() throws InterruptedException {
        click(By.name("selected[]"));
    }

    public void initGroupModification() throws InterruptedException {
        click(By.name("edit"));
    }

    public void submitGroupModification() throws InterruptedException {
        click(By.name("update"));
    }
}
