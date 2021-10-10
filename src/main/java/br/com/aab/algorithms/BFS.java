package br.com.aab.algorithms;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private final String path;

    public BFS(String path) {
        this.path = path;
    }

    public List<String> directoryList() {
        File root = new File(this.path);
        List<String> result = new ArrayList<>();
        Queue<File> fileQueue = new LinkedList<>();
        fileQueue.add(root);
        while (root.listFiles() != null && ! fileQueue.isEmpty()) {
            Arrays.stream(fileQueue.poll().listFiles())
                    .forEach(f -> {
                        if (f.isDirectory()) {
                            fileQueue.add(f);
                        } else {
                            result.add(f.getAbsolutePath());
                        }
                    }
            );
        }
        return result;
    }
}
