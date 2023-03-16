package edu.bu.met.cs665.email;

public abstract class Email {


  public abstract String writeEmail();

  public String toString() {
    return this.writeEmail();
  }
  
}
