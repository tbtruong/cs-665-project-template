package edu.bu.met.cs665.email;


import edu.bu.met.cs665.email.accounts.AccountFactory;

public class WelcomeEmail extends Email {
  AccountFactory accountFactory;
  final String welcomeBody = "Welcome to <insert our company name>.";

  public WelcomeEmail(AccountFactory accountFactory) {
    this.accountFactory = accountFactory;
  }


  @Override
  public String writeEmail() {
    return String.join(" ", accountFactory.createHeader(), welcomeBody,
        accountFactory.createAdditionalWelcomeBody(), accountFactory.createSignature());
  }
}
