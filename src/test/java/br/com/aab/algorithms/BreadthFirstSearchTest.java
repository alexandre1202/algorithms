package br.com.aab.algorithms;

import org.junit.Test;

public class BreadthFirstSearchTest {

    @Test
    public void listingFilesNamesInInvalidSubdirectory() {
        new BreadthFirstSearch().listDirectory("/Users/alexandre/invalidDir").forEach(System.out::println);
    }

    @Test
    public void listingJDKSubdirectoryt() {
        new BreadthFirstSearch().listDirectory(System.getProperty("java.home")).forEach(System.out::println);
    }
}