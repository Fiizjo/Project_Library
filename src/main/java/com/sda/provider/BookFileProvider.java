package com.sda.provider;


import com.sda.model.Author;
import com.sda.model.Book;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BookFileProvider implements BookProvider {

    private String filePath = "src/main/resources/books";

    public BookFileProvider() {
    }

    public BookFileProvider(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Set<Book> getAllBooks() {
        Set<Book> books = new HashSet<>();
        addAllBooksFromFileToSet(books);
        return books;
    }

    @Override
    public Set<Book> getBooksByAuthor(Author author) {
        return getAllBooks().stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toSet()
                );
    }

    private void addAllBooksFromFileToSet(Set<Book> books) {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                books.add(mapToBook(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Book mapToBook(String bookLine) {
        String[] lineResult = bookLine.split(";");
        return Book.builder()
                .title(lineResult[0])
                .isbn(lineResult[1])
                .author(mapToAuthor(lineResult))
                .releaseDate(mapToLocalDate(lineResult))
                .build();
    }

    private Author mapToAuthor(String[] lineResult) {
        return Author.builder()
                .name(lineResult[2])
                .lastName(lineResult[3])
                .build();
    }

    private LocalDate mapToLocalDate(String[] lineResult) {
        return LocalDate.parse(lineResult[4]);
    }
}
