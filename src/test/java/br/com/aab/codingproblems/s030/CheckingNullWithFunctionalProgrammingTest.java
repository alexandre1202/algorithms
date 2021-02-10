package br.com.aab.codingproblems.s030;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckingNullWithFunctionalProgrammingTest {

    private CheckingNullWithFunctionalProgramming check = new CheckingNullWithFunctionalProgramming();

    @Test
    public void testGetNameFromList() {
        List<String> names = Arrays.asList(null, "Adam", null, "James", null, "Smith", "Joe");

        String result = check.getNameFromListNotNull(names, "James");
        assertThat(result).isEqualTo("James");
    }

    @Test
    public void testGetNameFromListNotFound() {
        List<String> names = Arrays.asList(null, "Adam", null, "James", null, "Smith", "Joe");

        String result = check.getNameFromListNotNull(names, "Alexandre");
        assertThat(result).isEqualTo("Not Found");
    }

    @Test
    public void testGetNameFromConcurrentMap() {
        String result = check.getNameFromMap(getCMap(), "LA");
        assertThat(result).isEqualTo("Louisiana");
    }

    @Test
    public void testGetNameFromConcurrentMapNotFound() {
        String result = check.getNameFromMap(getCMap(), "LX");
        assertThat(result).isEqualTo("Not Found");
    }

    private ConcurrentHashMap getCMap() {
        ConcurrentHashMap<String, String> ufMap = new ConcurrentHashMap<>(51, 51);
        ufMap.put("AL", "Alabama");
        ufMap.put("AK", "Alaska");
        ufMap.put("AZ", "Arizona");
        ufMap.put("AR", "Arkansas");
        ufMap.put("CA","California");
        ufMap.put("CO","Colorado - CO");
        ufMap.put("CT","Connecticut");
        ufMap.put("DE","Delaware");
        ufMap.put("FL","Florida");
        ufMap.put("GA","Georgia");
        ufMap.put("HI","Hawaii");
        ufMap.put("ID","Idaho ");
        ufMap.put("IL","Illinois");
        ufMap.put("IN","Indiana");
        ufMap.put("IA","Iowa");
        ufMap.put("KS","Kansas");
        ufMap.put("KY","Kentucky");
        ufMap.put("LA","Louisiana");
        ufMap.put("ME","Maine");
        ufMap.put("MD","Maryland");
        ufMap.put("MA","Massachusetts");
        ufMap.put("MI","Michigan");
        ufMap.put("MN","Minnesota");
        ufMap.put("MS","Mississippi");
        ufMap.put("MO","Missouri");
        ufMap.put("MT","Montana");
        ufMap.put("NE","Nebraska");
        ufMap.put("NV","Nevada");
        ufMap.put("NH","New Hampshire");
        ufMap.put("NJ","New Jersey");
        ufMap.put("NM","New Mexico");
        ufMap.put("NY","New York");
        ufMap.put("NC","North Carolina");
        ufMap.put("ND","North Dakota");
        ufMap.put("OH","Ohio");
        ufMap.put("OK","Oklahoma");
        ufMap.put("OR","Oregon");
        ufMap.put("PA","Pennsylvania");
        ufMap.put("RI","Rhode Island");
        ufMap.put("SC","South Carolina");
        ufMap.put("SD","South Dakota");
        ufMap.put("TN","Tennessee");
        ufMap.put("TX","Texas");
        ufMap.put("UT","Utah");
        ufMap.put("VT","Vermont");
        ufMap.put("VA","Virginia");
        ufMap.put("WA","Washington");
        ufMap.put("WV","West Virginia");
        ufMap.put("WI","Wisconsin");
        ufMap.put("WY","Wyoming");
        return ufMap;
    }
}