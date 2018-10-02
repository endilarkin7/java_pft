package ru.stqa.pft.addressbook.appmanager.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
    super(wd);
    }

    public void gotoGroupPage() { click(By.linkText("groups"));
    }
    public void gotoHomePage() { click(By.id("logo"));


    }

}
