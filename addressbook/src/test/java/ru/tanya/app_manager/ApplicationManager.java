package ru.tanya.app_manager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by taty on 14.08.2017.
 */
public class ApplicationManager {
    private FirefoxDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

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
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
    
    public SessionHelper getSessionHelper(){
        return sessionHelper;
    }

    public ContactHelper getContactHelper(){
        return contactHelper;
    }
}
