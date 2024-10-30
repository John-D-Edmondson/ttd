package org.example.bank;

public class BankAccount {
    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public BankAccount(){};

    public int deposit(Double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            return 1;
        }
        if (depositAmount == null){
            throw new NullPointerException("Must be a number");
        }
        else {
            throw new IllegalArgumentException("Must be a valid number");
        }
    }

    public int withdraw(Double withdrawalAmount){
        if (withdrawalAmount == null){
            throw new NullPointerException("withdrawal cannot be null");
        }
        if (withdrawalAmount < 0){
            throw new IllegalArgumentException("withdrawal cannot be negative");
        }
        if (withdrawalAmount > balance){
            return -1;
        }

        balance -= withdrawalAmount;
        return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", minBalance=" + minBalance +
                '}';
    }
}
