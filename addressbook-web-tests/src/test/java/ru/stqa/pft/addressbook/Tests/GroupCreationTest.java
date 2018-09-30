package ru.stqa.pft.addressbook.Tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.Model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();  // Перейти на страницу списка групп
        app.getGroupHelper().initGroupCreation();  // Создать новую группу
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));  // Заполнить форму какимыта данными
        app.getGroupHelper().submitGroupCreation(); //Подтвердить создание группы
        app.getGroupHelper().returntoGroupPage(); //Вернуться на страницу создания групп

    }

}
