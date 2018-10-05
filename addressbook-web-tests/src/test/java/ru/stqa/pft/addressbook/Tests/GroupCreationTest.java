package ru.stqa.pft.addressbook.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();  // Перейти на страницу списка групп
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupData(null, "test2", "test3"));  // Создать новую группу
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before + 1);
    }
}
