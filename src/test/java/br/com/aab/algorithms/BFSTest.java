package br.com.aab.algorithms;

import org.junit.Test;

public class BFSTest {

    private BFS bfs;

    @Test
    public void testListDirectoryJava() {
        String path = "/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/";
        bfs = new BFS(path);
        bfs.directoryList().forEach(System.out::println);
    }

    @Test
    public void testListDirectoryEmpty() {
        String path = "/Users/alexandre1202/tempPath/";
        bfs = new BFS(path);
        bfs.directoryList().forEach(System.out::println);
    }

    @Test
    public void testListDirectoryDoesNotExists() {
        String path = "/Users/alexandre1202/shit/";
        bfs = new BFS(path);
        bfs.directoryList().forEach(System.out::println);
    }

}