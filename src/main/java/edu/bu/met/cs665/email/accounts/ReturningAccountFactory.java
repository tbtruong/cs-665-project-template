package edu.bu.met.cs665.email.accounts;

public class ReturningAccountFactory implements AccountFactory {

  @Override
  public String createHeader() {
    return "Returning Account Header, \n";
  }

  @Override
  public String createSignature() {
    return "Thank you for your rejoining the family!\n Sincerely, "
        + "\n <our company name>";
  }

  @Override
  public String createAdditionalWelcomeBody() {
    return "We are delighted to welcome you back <insert customer name>.\n";
  }

  @Override
  public String createAdditionalPaymentReminderBody() {
    return "We value our customers. If there are any problems, " +
        "please contact our support team at <insert customer support number>";
  }
}

