package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Serg on 03.05.2017.
 */
public class TestBase {
  FirefoxDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");

  }

  private void login(String username, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  protected void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  protected void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).click();
    wd.findElement(By.name("group_name")).clear();
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).click();
    wd.findElement(By.name("group_header")).clear();
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wd.findElement(By.name("group_footer")).click();
    wd.findElement(By.name("group_footer")).clear();
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  protected void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  protected void deleteSelectedGroups() {
    wd.findElement(By.name("delete")).click();
  }

  protected void selectedGroup() {
    wd.findElement(By.name("selected[]")).click();
  }
}
