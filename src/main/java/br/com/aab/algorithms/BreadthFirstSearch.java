package br.com.aab.algorithms;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

public class BreadthFirstSearch {
    public static List<String> listDirectory(final String path) {
        final List<String> result = new ArrayList<>();
        final Queue<File> fileQueue = new LinkedList<File>() {{ add(new File(path)); }};

        while (! fileQueue.isEmpty()) {
            File[] files = Optional.ofNullable(fileQueue.poll().listFiles()).orElse(new File[0]);
            for (File file : files) {
                if (file.isDirectory())
                    fileQueue.add(file);
                else
                    result.add(file.getAbsoluteFile().toString());
            }
        }

        return result;
    }
}
