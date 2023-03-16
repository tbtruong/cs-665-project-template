package edu.bu.met.cs665.email;

/**
 * This Class represents an abstract email.
 *
 * @author Tung
 */
public abstract class Email {


  public abstract String writeEmail();

  public String toString() {
    return this.writeEmail();
  }

}
