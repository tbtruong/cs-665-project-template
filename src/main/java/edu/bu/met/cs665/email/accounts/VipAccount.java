package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.PaymentReminderEmail;
import edu.bu.met.cs665.email.WelcomeEmail;

public class VipAccount extends Account {
  @Override
  public Email createEmail(String type) {
    Email email = null;
    VipAccountFactory vipAccountFactory = new VipAccountFactory();

    if (type.equals("welcome")) {
      email = new WelcomeEmail(vipAccountFactory);
    } else if (type.equals("paymentReminder")) {
      email = new PaymentReminderEmail(vipAccountFactory);
    }

    return email;

  }
}
