package edu.bu.met.cs665.email.accounts;

public class NewAccountFactory implements AccountFactory {

  @Override
  public String createHeader() {
    return "New Account Header, \n";
  }

  @Override
  public String createSignature() {
    return "Thank you for joining the <company name> family! \n Sincerely, "
        + "\n <our company name>";
  }

  @Override
  public String createAdditionalWelcomeBody() {
    return "";
  }

  @Override
  public String createAdditionalPaymentReminderBody() {
    return "We value our customers. If there are any problems, " +
        "please contact our support team at <insert customer support number>";
  }
}

