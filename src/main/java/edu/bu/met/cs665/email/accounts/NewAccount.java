package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.PaymentReminderEmail;
import edu.bu.met.cs665.email.WelcomeEmail;

public class NewAccount extends Account {
  @Override
  public Email createEmail(String type) {
    Email email = null;
    NewAccountFactory newAccountFactory = new NewAccountFactory();

    if (type.equals("welcome")) {
      email = new WelcomeEmail(newAccountFactory);
    } else if (type.equals("paymentReminder")) {
      email = new PaymentReminderEmail(newAccountFactory);
    }

    return email;

  }
}
