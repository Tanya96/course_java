package ru.tanya.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.tanya.app_manager.ApplicationManager;
import ru.tanya.model.NewContactData;

/**
 * Created by taty on 14.08.2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
