package ru.tanya.tests;

import org.testng.annotations.Test;
import ru.tanya.model.NewContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void addNewContact() throws InterruptedException {
        app.getContactHelper().addNew();
        app.getContactHelper().fillFields(new NewContactData("Tanya", "Andreeva", "Penza", "89374249767", "andreeva-tanja@mail.ru"));
        app.getNavigationHelper().returnHomePage();
    }

}
