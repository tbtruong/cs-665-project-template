package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.PaymentReminderEmail;
import edu.bu.met.cs665.email.WelcomeEmail;

public class FrequentAccount extends Account {
  @Override
  public Email createEmail(String type) {
    Email email = null;
    FrequentAccountFactory frequentAccountFactory = new FrequentAccountFactory();

    if (type.equals("welcome")) {
      email = new WelcomeEmail(frequentAccountFactory);
    } else if (type.equals("paymentReminder")) {
      email = new PaymentReminderEmail(frequentAccountFactory);
    }

    return email;

  }

}

