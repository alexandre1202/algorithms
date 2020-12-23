package br.com.aab.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BreadthFirstSearchTest {

    private BreadthFirstSearch bfs;

    @Before
    public void setUp() throws Exception {
        bfs = new BreadthFirstSearch("/Users/alexandre1202/Pictures");
    }

    @Test
    public void listingFilesNamesInSubdirectories() {
        List<String> result = bfs.listingFilesNamesInSubdirectories();
        result.forEach(System.out::println);
        assertThat(result)
                .isNotEmpty()
                .isNotEmpty()
        ;
        result.stream().forEach(System.out::println);
    }
}