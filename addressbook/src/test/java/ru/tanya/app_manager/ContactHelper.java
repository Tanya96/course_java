package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tanya.model.NewContactData;

/**
 * Created by taty on 14.08.2017.
 */
public class ContactHelper {
    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void fillFields(NewContactData newContactData) throws InterruptedException {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(newContactData.getFirstName());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(newContactData.getLastName());
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(newContactData.getCity());
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(newContactData.getNumber());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(newContactData.getEmail());
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
        Thread.sleep(500);
    }

    public void addNew() throws InterruptedException {
        wd.findElement(By.linkText("add new")).click();
        Thread.sleep(500);
    }
}
