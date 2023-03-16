/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.email.accounts.Account;
import edu.bu.met.cs665.email.accounts.BusinessAccount;
import edu.bu.met.cs665.email.accounts.FrequentAccount;
import edu.bu.met.cs665.email.accounts.NewAccount;
import edu.bu.met.cs665.email.accounts.ReturningAccount;
import edu.bu.met.cs665.email.accounts.VipAccount;
import edu.bu.met.cs665.example1.Person;
import edu.bu.met.cs665.email.*;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    System.out.println("This is a test message from the Main class (Main.java file)");

    Main m = new Main();
    m.runScenario();


  }

  /**
   * This method performs XYZ and returns String.
   *
   * @return String
   */

  private void runScenario() {
    BusinessAccount buisnessAccount = new BusinessAccount();
    System.out.println(buisnessAccount.createEmail("welcome").writeEmail());
    System.out.println(buisnessAccount.createEmail("paymentReminder").writeEmail());

    FrequentAccount frequentAccount = new FrequentAccount();
    System.out.println(frequentAccount.createEmail("welcome").writeEmail());
    System.out.println(frequentAccount.createEmail("paymentReminder").writeEmail());

    NewAccount newAccount = new NewAccount();
    System.out.println(newAccount.createEmail("welcome").writeEmail());
    System.out.println(newAccount.createEmail("paymentReminder").writeEmail());

    ReturningAccount returningAccount = new ReturningAccount();
    System.out.println(returningAccount.createEmail("welcome").writeEmail());
    System.out.println(returningAccount.createEmail("paymentReminder").writeEmail());

    VipAccount vipAccount = new VipAccount();
    System.out.println(vipAccount.createEmail("welcome").writeEmail());
    System.out.println(vipAccount.createEmail("paymentReminder").writeEmail());

  }

}
