package br.com.aab.lambda;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MyFunctionalInterfaceExamplesTest {

    private MyFunctionalInterfaceExamples myFI = new MyFunctionalInterfaceExamples();

    @Test
    public void testAddingWithFunctionInterface() {
        Integer result = myFI.addingTwoValues(25, 35);
        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void testAddingAndMultiplingTwoValues() {
        Integer result = myFI.addingAndMultiplingTwoValues(30);
        Assertions.assertThat(result).isEqualTo(160);
    }
}