package edu.bu.met.cs665.email.accounts;

import edu.bu.met.cs665.email.Email;

/**
 * This Class represents an abstract Account.
 *
 * @author Tung
 */
public abstract class Account {
  abstract Email createEmail(String type);


}
