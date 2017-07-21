package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper()
            .fillContactForm(new ContactData(
                    "John",
                    "Smith",
                    "SuperCompany",
                    "Some text",
                    "725-25-25",
                    "0971111111",
                    "test@gmail.com",
                    "test1"),
                    true);
    app.getContactHelper().submitForm();
    app.getNavigationHelper().gotoHomePage();
  }
}
