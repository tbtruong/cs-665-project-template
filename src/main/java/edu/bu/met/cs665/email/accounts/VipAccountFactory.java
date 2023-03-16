package edu.bu.met.cs665.email.accounts;

public class VipAccountFactory implements AccountFactory {

  @Override
  public String createHeader() {
    return "VIP Account Header, \n";
  }

  @Override
  public String createSignature() {
    return "Thank you for your business with us <insert business account's name>! "
        +
        "If there is anything we can do for you please do not hesitate to reach out.\n Sincerely,\n"
        + "<our company name>";
  }

  @Override
  public String createAdditionalWelcomeBody() {
    return "Our company would love to offer you additional VIP benefits that can be found here: "
        + "<link>.\n";
  }

  @Override
  public String createAdditionalPaymentReminderBody() {
    return "If there are any problems, please contact our specialized support line for VIPS "
        + "accounts at <insert vip hotline>. \n";
  }
}
