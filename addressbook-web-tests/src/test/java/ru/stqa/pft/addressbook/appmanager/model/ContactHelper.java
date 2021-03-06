package ru.stqa.pft.addressbook.appmanager.model;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd); }

    public void initContactCreation() {
        click(By.linkText("add new")); }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        } }

    public void submitContactCreation() {
        click(By.name("submit")); }

    public void returnToHomePage() {
        click(By.linkText("home page")); }

    public void initContactModification() {
        click(By.cssSelector("img[alt='Edit']")); }

    public void submitContactModification() {
        click(By.name("update")); }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size(); }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]")); }

    public void createGontact(ContactData contactData) {
        initContactCreation();  // Создать новую группу
        fillContactForm(new ContactData
                ("test_name", "test_surname", "test1"), true);
        submitContactCreation(); //Подтвердить создание группы  }
        returnToHomePage(); }
}


