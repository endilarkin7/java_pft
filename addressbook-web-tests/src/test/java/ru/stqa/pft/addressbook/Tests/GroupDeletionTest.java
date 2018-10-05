package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;


public class GroupDeletionTest extends TestBase{


    @Test
    public void GroupDeletionTest() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAGroup()) { //Щоб удалити тест, треба щоб він був, тому створюємо
        app.getGroupHelper().createGroup(new GroupData("test1",null,null));  }
        app.getGroupHelper().selectGroup(before - 1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returntoGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before - 1);
    } }
