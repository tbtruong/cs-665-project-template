package edu.bu.met.cs665.email.accounts;

public class BusinessAccountFactory implements AccountFactory {

  @Override
  public String createHeader() {
    return "Business Account Header, \n";
  }

  @Override
  public String createSignature() {
    return "Thank you for your business with us <insert business account's name>! \n Sincerely, "
        + "\n <our company name>";
  }

  @Override
  public String createAdditionalWelcomeBody() {
    return "We hope to grow hand and hand with <insert company name>.\n";
  }

  @Override
  public String createAdditionalPaymentReminderBody() {
    return "If there are any problems, please contact our specialized support line for business "
        + "accounts at <insert business hotline>. \n";
  }
}
