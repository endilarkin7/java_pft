package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

public class GroupModificationTests extends TestBase{

@Test
    public void  testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) { //Щоб удалити тест, треба щоб він був, тому створюємо
        app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }app.getGroupHelper().selectGroup(0);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData(null, "test2", "test3"));  // Заполнить форму какимыта данными
    app.getGroupHelper().submitGroupModification();

}
}
