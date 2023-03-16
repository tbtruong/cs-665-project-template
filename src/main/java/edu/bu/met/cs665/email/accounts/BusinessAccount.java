package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.PaymentReminderEmail;
import edu.bu.met.cs665.email.WelcomeEmail;

//Specific Pizza Store
public class BusinessAccount extends Account {

  @Override
  public Email createEmail(String type) {
    Email email = null;
    BusinessAccountFactory businessAccountFactory = new BusinessAccountFactory();

    if (type.equals("welcome")) {
      email = new WelcomeEmail(businessAccountFactory);
    } else if (type.equals("paymentReminder")) {
      email = new PaymentReminderEmail(businessAccountFactory);
    }

    return email;

  }

}
