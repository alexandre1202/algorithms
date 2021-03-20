package br.com.aab.collections.sortwithcomparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private int idBook;
    private String title;
    private LocalDateTime publish;
}
