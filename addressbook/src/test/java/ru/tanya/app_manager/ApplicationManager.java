package ru.tanya.app_manager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

/**
 * Created by taty on 14.08.2017.
 */
public class ApplicationManager {
    private WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() throws InterruptedException {
        if(browser.equals(BrowserType.FIREFOX)){
            System.setProperty("webdriver.gecko.driver","D:\\programs\\geckodriver\\geckodriver.exe");
            wd = new FirefoxDriver();
        }
        else if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.IEXPLORE)){
            wd = new InternetExplorerDriver();
        }

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
