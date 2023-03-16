package edu.bu.met.cs665.email.accounts;

public class FrequentAccountFactory implements AccountFactory {

  @Override
  public String createHeader() {
    return "Frequent Account Header, \n";
  }

  @Override
  public String createSignature() {
    return
        "Thank you for your frequent business with us <insert frequent account's name>! \n Sincerely, "
            + "\n <our company name>";
  }

  @Override
  public String createAdditionalWelcomeBody() {
    return "Please continue supporting our products.\n";
  }

  @Override
  public String createAdditionalPaymentReminderBody() {
    return
        "We value your continuous support. If there are any problems, " +
            "please contact our support team at <insert customer support number>";
  }
}

