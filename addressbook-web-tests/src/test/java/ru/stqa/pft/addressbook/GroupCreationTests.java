package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1GrName", "test2GrHeader", "test3GrFooter"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
