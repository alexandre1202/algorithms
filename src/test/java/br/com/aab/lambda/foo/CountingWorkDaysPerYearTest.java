package br.com.aab.lambda.foo;

import org.junit.Test;

import java.util.Map;

public class CountingWorkDaysPerYearTest {

    private CountingWorkDaysPerYear countingWorkDaysPerYear = new CountingWorkDaysPerYear();

    @Test
    public void testWorkDaysPerMonth() {
        int year = 2023;
        Map<String, Long> workDaysPerYear = countingWorkDaysPerYear.getWorkDaysPerYear(year);

        workDaysPerYear.forEach((k, v) -> {
            System.out.println(k + " \t " + v);
        });
    }
}