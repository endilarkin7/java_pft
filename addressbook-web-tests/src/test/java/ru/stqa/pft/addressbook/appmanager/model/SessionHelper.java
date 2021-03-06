package ru.stqa.pft.addressbook.appmanager.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.appmanager.HelperBase;

public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
