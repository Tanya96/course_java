package ru.tanya.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.tanya.model.NewContactData;

public class AddNewContactTests extends TestBase {

    @Test
    public void addNewContact() throws InterruptedException {
        addNew();
        fillFields(new NewContactData("Tanya", "Andreeva", "Penza", "89374249767", "andreeva-tanja@mail.ru"));
        app.returnHomePage();
    }

    private void fillFields(NewContactData newContactData) throws InterruptedException {
        app.wd.findElement(By.name("firstname")).click();
        app.wd.findElement(By.name("firstname")).clear();
        app.wd.findElement(By.name("firstname")).sendKeys(newContactData.getFirstName());
        app.wd.findElement(By.name("lastname")).click();
        app.wd.findElement(By.name("lastname")).clear();
        app.wd.findElement(By.name("lastname")).sendKeys(newContactData.getLastName());
        app.wd.findElement(By.name("address")).click();
        app.wd.findElement(By.name("address")).clear();
        app.wd.findElement(By.name("address")).sendKeys(newContactData.getCity());
        app.wd.findElement(By.name("theform")).click();
        app.wd.findElement(By.name("mobile")).click();
        app.wd.findElement(By.name("mobile")).clear();
        app.wd.findElement(By.name("mobile")).sendKeys(newContactData.getNumber());
        app.wd.findElement(By.name("email")).click();
        app.wd.findElement(By.name("email")).clear();
        app.wd.findElement(By.name("email")).sendKeys(newContactData.getEmail());
        app.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
        Thread.sleep(500);
    }

    private void addNew() throws InterruptedException {
        app.wd.findElement(By.linkText("add new")).click();
        Thread.sleep(500);
    }
}
