package br.com.aab.algorithms;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public String path;

    public BreadthFirstSearch(String path) { this.path = path; }

    public List<String> listingFilesNamesInSubdirectories() {
        File rootDirectoryFile = new File(this.path);
        if (! rootDirectoryFile.exists()) return null;

        List<String> result = new ArrayList<>();
        Queue<File> queueFile = new LinkedList<>();
        queueFile.add(rootDirectoryFile);
        while(! queueFile.isEmpty()) {
            File currentFileQueue = queueFile.poll();
            File[] currentFiles = currentFileQueue.listFiles();
            for(File file : currentFiles) {
                if (file.isDirectory()) {
                    queueFile.add(file);
                } else {
                    result.add(file.getAbsoluteFile().toString());
                }
            }
        }
        return result;
    }
}
