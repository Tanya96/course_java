package ru.tanya.app_manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tanya.model.NewContactData;

/**
 * Created by taty on 14.08.2017.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
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
}
