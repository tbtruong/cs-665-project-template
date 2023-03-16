package edu.bu.met.cs665.email.accounts;

public class BusinessAccountFactory implements AccountFactory {

  /**
   * Method to generate a header that is unique to the business class
   */
  @Override
  public String createHeader() {
    return "Business Account Header, \n";
  }

  /**
   * Method to generate a signature that is unique to the business class
   */

  @Override
  public String createSignature() {
    return "Thank you for your business with us <insert business account's name>! \n Sincerely, "
        + "\n <our company name>";
  }

  /**
   * Method to generate additional welcome test that is unique to the business class
   */
  @Override
  public String createAdditionalWelcomeBody() {
    return "We hope to grow hand and hand with <insert company name>.\n";
  }

  /**
   * Method to generate a additional payment text that is unique to the business class
   */
  @Override
  public String createAdditionalPaymentReminderBody() {
    return "If there are any problems, please contact our specialized support line for business "
        + "accounts at <insert business hotline>. \n";
  }
}
