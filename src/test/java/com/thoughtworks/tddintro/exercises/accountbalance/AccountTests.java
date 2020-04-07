package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTests {
    private Account account;

    @Before
    public void setUp() throws Exception {
        // given
        account = new Account(100);
    }


    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        // when
        account.deposit(50);

        // then
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        // when
        account.withdraw(50);

        // then
        assertEquals(50.0, account.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        // when
        account.withdraw(150);
    }
}
