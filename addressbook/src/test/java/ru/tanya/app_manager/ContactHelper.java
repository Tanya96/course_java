package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tanya.model.NewContactData;

/**
 * Created by taty on 14.08.2017.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillFields(NewContactData newContactData) throws InterruptedException {
        type(By.name("firstname"), newContactData.getFirstName());
        type(By.name("lastname"), newContactData.getLastName());
        type(By.name("address"), newContactData.getCity());
        type(By.name("mobile"), newContactData.getNumber());
        type(By.name("email"), newContactData.getEmail());
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void addNew() throws InterruptedException {
        click(By.linkText("add new"));
    }

    public void deleteContact() throws InterruptedException {
        click(By.cssSelector("input[value='Delete']"));
    }

    public void selectContact() throws InterruptedException {
        click(By.name("selected[]"));
    }

    public void editContact() throws InterruptedException {
        click(By.cssSelector("img[title='Edit']"));
    }

    public void updateContact() throws InterruptedException {
        click(By.name("update"));
    }
}
