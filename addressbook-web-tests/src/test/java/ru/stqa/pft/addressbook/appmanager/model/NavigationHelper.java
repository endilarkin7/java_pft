package ru.stqa.pft.addressbook.appmanager.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
    super(wd);
    }

    public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))  //провіряємо НАЯВНІСТЬ Заголовка
        && wd.findElement(By.tagName("h1")).getText().equals("Groups")
        && isElementPresent(By.name("new"))) {
        return; // - выход з метода, если проверка пройшла
    }   //якщо if не виконалось, то сlick...
    click(By.linkText("groups")); }

    public void gotoHomePage() {
    if (isElementPresent(By.id("maintable"))) {
        return; // якщо не знайшовся елемент то робити нічого не треба
    }
    click(By.id("logo"));  //так як не знайшов елемент, то клікне }
    }}

