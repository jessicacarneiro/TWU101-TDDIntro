package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
        assertThat(150.0, is(equalTo(account.getBalance())));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        // when
        account.withdraw(50);

        // then
        assertThat(50.0, is(equalTo(account.getBalance())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        // when
        account.withdraw(150);
    }
}
