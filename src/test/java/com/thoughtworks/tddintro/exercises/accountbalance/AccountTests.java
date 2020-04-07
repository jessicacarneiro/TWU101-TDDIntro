package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        // given
        Account account = new Account(100);

        // when
        account.deposit(50);

        // then
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        // given
        Account account = new Account(100);

        // when
        account.withdraw(50);

        // then
        assertEquals(50.0, account.getBalance());
    }

    @Test
    @Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

    }
}
