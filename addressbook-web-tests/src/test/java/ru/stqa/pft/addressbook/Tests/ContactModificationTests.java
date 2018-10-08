/* package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.ContactData;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

public class ContactModificationTests extends TestBase {

    @BeforeMethod (enabled = false)
    public void ensurePreconditions() {
        app.goTo().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createGontact(new ContactData("test1", null,"test1")); }
    }

    @Test (enabled = false)
    public void testModificationContact()  {

        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        GroupData group = new GroupData("test1","test2","test3");
        app.getContactHelper().fillContactForm
                (new ContactData("test_name", "test_surname", "test1"), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before);
}} */