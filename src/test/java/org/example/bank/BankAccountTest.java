package org.example.bank;

import org.example.bank.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// check if account exists assetException.
// savings account max balance
class BankAccountTest {
    @Test
    // Deposit Tests
    // check that the balance has increased by the deposit amount.
    // check there is not a negative value to deposit.
    void depositTestIncreaseBalance(){
        BankAccount Ba = new BankAccount();
        Ba.setBalance(20.00);
        double depositAmount = 11.99;
        int result = Ba.deposit(depositAmount);
        assertEquals(depositAmount, Math.round((Ba.getBalance() - 20) * 100.0) / 100.0);
        assertEquals(1, result);
    }
    @Test
    void depositTestNegativeValue(){
        BankAccount Ba = new BankAccount();
        double negValue = -1;
        assertThrows(IllegalArgumentException.class, () -> Ba.deposit(negValue));

    }
    @Test
    void depositTestNullValue(){
        BankAccount Ba = new BankAccount();
        assertThrows(NullPointerException.class, () -> Ba.deposit(null));
    }

    // tests withdrawal
    // normal withdrawal balance reduces correctly
    // to large withdrawal no change in balance
    // incorrect values (neg, null)
//    void withdrawalStringValue(){
//        BankAccount Ba = new BankAccount();
//    }
//    void withdrawalMoneyAvailable(){
//        BankAccount Ba = new BankAccount();
//        double withdrawlAmount = 100;
//        Ba.setBalance(150);
//        int result = Ba.witdraw(withdrawlAmount);
//        assertEquals(Ba.getBalance == 50);
//        assertEquals(result  == 1);
//    }
//
//    void withdrawalNoMoneyAvailable(){
//        BankAccount Ba = new BankAccount();
//        Ba.setBalance(50);
//        double withdrawalAmount = 100;
//        int result = Ba.withDraw(withdrawalAmount);
//        assertEquals(Ba.getBalance() == 50);
//        assertEquals(result == -1);
//    }
//
//    void withdrawalTestNegativeValue(){
//        BankAccount Ba = new BankAccount();
//        double negValue = -1;
//        assertThrows(IllegalArgumentException.class, () -> Ba.withdraw(negValue));
//
//    }
//    void withdrawalTestNullValue(){
//        BankAccount Ba = new BankAccount();
//        assertThrows(IllegalArgumentException.class, () -> Ba.withdraw(null));
//    }

}