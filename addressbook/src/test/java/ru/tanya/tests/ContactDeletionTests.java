package ru.tanya.tests;

import org.testng.annotations.Test;

/**
 * Created by taty on 16.08.2017.
 */
public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() throws InterruptedException {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().acceptAlert();
    }
}
