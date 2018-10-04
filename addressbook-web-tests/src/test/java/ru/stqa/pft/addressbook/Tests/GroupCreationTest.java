package ru.stqa.pft.addressbook.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount(); // к-сть групп ДО добавления
        app.getGroupHelper().createGroup(new GroupData(null, "test2", "test3"));
        int after = app.getGroupHelper().getGroupCount(); // к-сть групп ПОСЛЕ добавление
        Assert.assertEquals(after,before + 1);
    }
}
