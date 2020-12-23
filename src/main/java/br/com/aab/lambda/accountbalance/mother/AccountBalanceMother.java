package br.com.aab.lambda.accountbalance.mother;

import br.com.aab.lambda.accountbalance.domain.AccountBalance;
import br.com.aab.lambda.accountbalance.domain.MixedBalances;

import java.util.Arrays;
import java.util.List;

import static br.com.aab.lambda.accountbalance.mother.MixedBalancesMother.*;

public class AccountBalanceMother {
    public static AccountBalance buildAccountBalance() {
        List<MixedBalances> mixedBalances = Arrays.asList(buildMixedBalancesPerType(1), buildMixedBalancesPerType(1), buildMixedBalancesPerType(1));

        AccountBalance accountBalance = new AccountBalance();
        accountBalance.setBranch(1);
        accountBalance.setAccount(1L);
        accountBalance.setMixedBalancesList(mixedBalances);

        return accountBalance;
    }
}
