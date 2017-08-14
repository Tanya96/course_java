package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by taty on 14.08.2017.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void goToGroupPage() throws InterruptedException {
        wd.findElement(By.cssSelector("a[href='group.php']")).click();
        Thread.sleep(500);
    }

    public void returnHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }
}
