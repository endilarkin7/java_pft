package ru.stqa.pft.addressbook.appmanager.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {  super(wd);  }

    public void initContactCreation() {click(By.linkText("add new"));}

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());

        if (creation) {
            new Select(wd.findElement(By.name("new_group")))
                    .selectByVisibleText(contactData.getGroup()); }
        else {
            Assert.assertFalse(isElementPresent(By.name("new_group"))); }}

    private boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator) ; // попытка поиска елемента
            return true; // Елемент есть и вернет значение true
        } catch (NoSuchElementException ex) { //Исключ озн. НЕТ ТАКОГО ЕЛЕМЕНТА
            return false; } }

    public void submitContactCreation() {click(By.name("submit")); }

    public void returnToHomePage() { click(By.linkText("home page"));  }

    public void initContactModification() { click(By.cssSelector("img[alt='Edit']")); }

    public void submitContactModification() { click(By.name("update")); }


}

