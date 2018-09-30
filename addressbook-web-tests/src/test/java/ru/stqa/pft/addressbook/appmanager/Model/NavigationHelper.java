package ru.stqa.pft.addressbook.appmanager.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
    super(wd);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }
}
