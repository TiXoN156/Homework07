package com.company;

public class Account {
    private String accountOwnerName;
    private String accountCurrency;
    private int accountAmount;

    public Account(String accountOwnerName, String accountCurrency, int accountAmount) {
        this.accountOwnerName = accountOwnerName;
        this.accountCurrency = accountCurrency;
        this.accountAmount = accountAmount;
    }

    public Account() {
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public int getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(int accountAmount) {
        this.accountAmount = accountAmount;
    }
}
