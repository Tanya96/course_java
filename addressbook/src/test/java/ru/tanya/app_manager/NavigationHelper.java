package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by taty on 14.08.2017.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void goToGroupPage() throws InterruptedException {
        click(By.cssSelector("a[href='group.php']"));
    }

    public void returnHomePage() throws InterruptedException {
        click(By.linkText("home page"));
    }
}
