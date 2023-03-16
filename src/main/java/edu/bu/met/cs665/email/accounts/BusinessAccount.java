package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.PaymentReminderEmail;
import edu.bu.met.cs665.email.WelcomeEmail;

/**
 * This Class represents a Business Account.
 *
 * @author Tung
 */
public class BusinessAccount extends Account {

  /**
   * Method to generate an email of a particular type
   *
   * @param type String
   */

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
