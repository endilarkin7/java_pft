package ru.stqa.pft.addressbook.Tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.model.GroupData;

public class GroupModificationTests extends TestBase{

@Test
    public void  testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData(null, "test2", "test3"));  // Заполнить форму какимыта данными
    app.getGroupHelper().submitGroupModification();
}
}
