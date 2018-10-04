package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
        }


    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator) ; // попытка поиска елемента
            return true; // Елемент есть и вернет значение true
        } catch (NoSuchElementException ex) { //Исключ озн. НЕТ ТАКОГО ЕЛЕМЕНТА
            return false; } }
}