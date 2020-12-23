package br.com.aab.lambda.accountbalance.service;

import br.com.aab.lambda.accountbalance.domain.AccountBalance;
import br.com.aab.lambda.accountbalance.domain.MixedBalances;

import java.util.Optional;

public class AccountBalanceService {

    public Optional<MixedBalances> getTotalAvailableBalance(AccountBalance accountBalance) {

        return accountBalance.getMixedBalancesList().stream()
                        .filter(mixedBalances -> mixedBalances.getMixedType() == 1)
                        .findFirst();

    }
}
