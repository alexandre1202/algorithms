package br.com.aab.lambda.accountbalance.mother;

import br.com.aab.lambda.accountbalance.domain.MixedBalances;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MixedBalancesMother {

    public static MixedBalances buildMixedBalancesPerType(Integer mixedBalanceType) {
        MixedBalances mixedBalances = new MixedBalances();
        mixedBalances.setMixedType(mixedBalanceType);
        mixedBalances.setBalance(Math.random() * 10000);
        return mixedBalances;
    }
}
