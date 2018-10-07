package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.ContactData;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

import java.awt.*;

public class ContactModificationTests extends TestBase {

    @Test
    public void testModificationContact()  {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createGontact(new ContactData("test1", null,"test1")); }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        GroupData group = new GroupData("test1","test2","test3");
        app.getContactHelper().fillContactForm
                (new ContactData("test_name", "test_surname", "test1"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before);
}}