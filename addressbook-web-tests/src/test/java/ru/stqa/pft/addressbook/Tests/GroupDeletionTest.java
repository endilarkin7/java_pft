package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.ContactData;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

import java.util.List;


public class GroupDeletionTest extends TestBase {

        @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().gotoHomePage();
        if (app.group().list().size() == 0 ) {
            app.group().create(new GroupData().withName("test2")); }}


        @Test
    public void GroupDeletionTest() {

        List<GroupData> before = app.group().list();
        int index = before.size() - 1;
        app.group().delete(index);
        List<GroupData> after = app.group().list();
        Assert.assertEquals(after.size() ,before.size() - 1);
    }


}
