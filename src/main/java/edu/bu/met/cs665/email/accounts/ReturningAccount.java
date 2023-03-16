package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.PaymentReminderEmail;
import edu.bu.met.cs665.email.WelcomeEmail;

public class ReturningAccount extends Account {
  @Override
  public Email createEmail(String type) {
    Email email = null;
    ReturningAccountFactory returningAccountFactory = new ReturningAccountFactory();

    if (type.equals("welcome")) {
      email = new WelcomeEmail(returningAccountFactory);
    } else if (type.equals("paymentReminder")) {
      email = new PaymentReminderEmail(returningAccountFactory);
    }

    return email;

  }
}
