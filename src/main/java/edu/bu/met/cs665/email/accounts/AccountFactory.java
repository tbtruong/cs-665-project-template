package edu.bu.met.cs665.email.accounts;

public interface AccountFactory {
  public String createHeader();

  public String createSignature();

  public String createAdditionalWelcomeBody();

  public String createAdditionalPaymentReminderBody();


}
