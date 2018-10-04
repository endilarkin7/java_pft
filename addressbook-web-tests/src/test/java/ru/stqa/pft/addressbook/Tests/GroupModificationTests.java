package ru.stqa.pft.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

public class GroupModificationTests extends TestBase{

@Test
    public void  testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if (! app.getGroupHelper().isThereAGroup()) { //Щоб удалити тест, треба щоб він був, тому створюємо
        app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData(null, "test2", "test3"));  // Заполнить форму какимыта данными
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returntoGroupPage();
    int after = app.getGroupHelper().getGroupCount(); // к-сть групп ПОСЛЕ добавление
    Assert.assertEquals(after,before);

}
}
