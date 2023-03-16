package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.email.accounts.BusinessAccount;
import edu.bu.met.cs665.email.accounts.FrequentAccount;
import edu.bu.met.cs665.email.accounts.FrequentAccountFactory;
import edu.bu.met.cs665.email.accounts.NewAccount;
import edu.bu.met.cs665.email.accounts.ReturningAccount;
import edu.bu.met.cs665.email.accounts.VipAccountFactory;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestEmail {

  @Test
  public void testWelcomeEmailBusinessAccount() {
    BusinessAccount buisnessAccount = new BusinessAccount();
    assertEquals("Business Account Header, \n" +
        " Welcome to <insert our company name>. We hope to grow hand and hand with <insert company name>.\n" +
        " Thank you for your business with us <insert business account's name>! \n" +
        " Sincerely, \n" +
        " <our company name>", buisnessAccount.createEmail("welcome").writeEmail());
  }

  @Test
  public void testHeaderFrequentAccount() {
    FrequentAccountFactory frequentAccountFactory = new FrequentAccountFactory();
    assertEquals("Frequent Account Header, \n", frequentAccountFactory.createHeader());
  }

  @Test
  public void testPaymentReminderNewAccount() {
    NewAccount newAccount = new NewAccount();
    assertEquals("New Account Header, \n" +
        " This is a reminder that your payment is due on <insert date> We value our customers. If there are any problems, please contact our support team at <insert customer support number> Thank you for joining the <company name> family! \n" +
        " Sincerely, \n" +
        " <our company name>", newAccount.createEmail("paymentReminder").writeEmail());
  }

  @Test
  public void testReturningAccountType() {
    ReturningAccount returningAccount = new ReturningAccount();
    assertEquals(returningAccount.getClass(), ReturningAccount.class);

  }

  @Test
  public void testVipAccount() {
    VipAccountFactory vipAccountFactory = new VipAccountFactory();
    assertEquals("If there are any problems, please contact our specialized " +
            "support line for VIPS accounts at <insert vip hotline>. \n",
        vipAccountFactory.createAdditionalPaymentReminderBody());
  }
}
