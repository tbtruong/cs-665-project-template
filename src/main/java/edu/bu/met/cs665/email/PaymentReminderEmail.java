package edu.bu.met.cs665.email;

import edu.bu.met.cs665.email.accounts.AccountFactory;

/**
 * This Class represents a payment Reminder email.
 *
 * @author Tung
 */
public class PaymentReminderEmail extends Email {
  AccountFactory accountFactory;
  final String paymentReminderBody = "This is a reminder that your payment is due on <insert date>";


  /**
   * Constructor method of paymentReminder email
   */

  public PaymentReminderEmail(AccountFactory accountFactory) {
    this.accountFactory = accountFactory;
  }


  /**
   * Method to generate a payment Reminder Email
   */

  @Override
  public String writeEmail() {
    return String.join(" ", accountFactory.createHeader(), paymentReminderBody,
        accountFactory.createAdditionalPaymentReminderBody(), accountFactory.createSignature());
  }
}
