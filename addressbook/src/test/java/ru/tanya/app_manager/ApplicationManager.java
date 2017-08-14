package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tanya.model.GroupData;

/**
 * Created by taty on 14.08.2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","D:\\programs\\geckodriver\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts();
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    public void login(String username, String password) throws InterruptedException {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        Thread.sleep(500);
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

    public void goToGroupPage() throws InterruptedException {
        wd.findElement(By.cssSelector("a[href='group.php']")).click();
        Thread.sleep(500);
    }

    public void returnHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void deleteSelectedGroups() throws InterruptedException {
        wd.findElement(By.name("delete")).click();
        Thread.sleep(500);
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }
}
