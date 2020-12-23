package br.com.aab.lambda.accountbalance.service;

import br.com.aab.lambda.accountbalance.domain.AccountBalance;
import br.com.aab.lambda.accountbalance.domain.MixedBalances;
import br.com.aab.lambda.accountbalance.mother.AccountBalanceMother;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class AccountBalanceServiceTest {

    private AccountBalanceService accountBalanceService;

    @Before
    public void setUp() throws Exception {
        accountBalanceService = new AccountBalanceService();
    }

    @Test
    public void getTotalAvailableBalance() throws Exception {
        AccountBalance accountBalance = AccountBalanceMother.buildAccountBalance();
        MixedBalances result = accountBalanceService.getTotalAvailableBalance(accountBalance)
                        .orElseThrow(() -> new Exception("Saldo nao encontrado"));
        Assertions.assertThat(result.getMixedType()).isEqualTo(1);
    }
}