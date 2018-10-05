package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testModificationContact()  {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm
                (new ContactData("test_name", "test_surname", "test1"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();

}}