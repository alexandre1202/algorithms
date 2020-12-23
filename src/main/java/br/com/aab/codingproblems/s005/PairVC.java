package br.com.aab.codingproblems.s005;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class PairVC<V,C> {
    final V vogais;
    final C consoantes;

    public PairVC(V vogais, C consoantes) {
        this.vogais = vogais;
        this.consoantes = consoantes;
    }

    public static <V, C> PairVC<V, C> of(V vogais, C consoantes) {
        return new PairVC<>(vogais, consoantes);
    }

    @Override
    public int hashCode() {
        return this.vogais.hashCode() ^ this.consoantes.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof PairVC)) return false;

        PairVC objPairVC = (PairVC) o;
        return this.vogais.equals(objPairVC.vogais) && this.consoantes.equals(objPairVC.consoantes);
    }
}
