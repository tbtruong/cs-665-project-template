package edu.bu.met.cs665.email;

import edu.bu.met.cs665.email.accounts.AccountFactory;

public class PaymentReminderEmail extends Email {
  AccountFactory accountFactory;
  final String paymentReminderBody = "This is a reminder that your payment is due on <insert date>";

  public PaymentReminderEmail(AccountFactory accountFactory) {
    this.accountFactory = accountFactory;
  }


  @Override
  public String writeEmail() {
    return String.join(" ", accountFactory.createHeader(), paymentReminderBody,
        accountFactory.createAdditionalPaymentReminderBody(), accountFactory.createSignature());
  }
}
