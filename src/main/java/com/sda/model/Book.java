package com.sda.model;

import com.sda.model.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
@Getter
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Book {
    private String title;
    private String isbn;
    private Author author;
    private LocalDate releaseDate;
}

