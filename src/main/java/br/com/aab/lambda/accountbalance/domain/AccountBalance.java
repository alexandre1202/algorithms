package br.com.aab.lambda.accountbalance.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountBalance {

    private Integer branch;
    private Long account;
    private List<MixedBalances> mixedBalancesList;
}
