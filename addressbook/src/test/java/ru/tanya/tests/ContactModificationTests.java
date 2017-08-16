package ru.tanya.tests;

import org.testng.annotations.Test;
import ru.tanya.model.NewContactData;

/**
 * Created by taty on 16.08.2017.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() throws InterruptedException {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().editContact();
        app.getContactHelper().fillFields(new NewContactData("Женя", "Меркульев", "Пенза", "89603154640", "owenmercury@gmail.com"));
        app.getContactHelper().updateContact();
    }
}
