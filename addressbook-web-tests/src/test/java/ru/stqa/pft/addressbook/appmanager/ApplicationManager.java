package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import ru.stqa.pft.addressbook.appmanager.model.ContactHelper;
import ru.stqa.pft.addressbook.appmanager.model.NavigationHelper;
import ru.stqa.pft.addressbook.appmanager.model.SessionHelper;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private String browser;
    WebDriver wd;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public ApplicationManager(String browser) {
    this.browser = browser;

    }


    public void init() { //Метод РОБИТЬ ВХІДя
        if (browser == (BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser == (BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser == (BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }

    public void stop() { // ВИХІД З БРАУЗЕРА
        wd.quit();
    }

    public GroupHelper getGroupHelper() { return groupHelper; }

    public NavigationHelper getNavigationHelper() { return navigationHelper;  }

    public ContactHelper getContactHelper() { return contactHelper; }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
