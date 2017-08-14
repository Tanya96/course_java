package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tanya.model.GroupData;

/**
 * Created by taty on 14.08.2017.
 */
public class GroupHelper {
    private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void returnGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() throws InterruptedException {
        wd.findElement(By.name("submit")).click();
        Thread.sleep(500);
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() throws InterruptedException {
        wd.findElement(By.name("new")).click();
        Thread.sleep(500);
    }

    public void deleteSelectedGroups() throws InterruptedException {
        wd.findElement(By.name("delete")).click();
        Thread.sleep(500);
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
}
