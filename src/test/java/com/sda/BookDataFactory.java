package com.sda;

import com.sda.model.Author;
import com.sda.model.Book;
import com.sda.model.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class BookDataFactory {

    public static final Book BOOK1 = new Book(
            "Star Wars Gwiezdne wojny Nowa nadzieja",
            "978-83-280-5836-1",
            new Author(
                    "George",
                    "Lucas"
            ),
            LocalDate.parse("2018-11-19")
    );

    private static final Book BOOK2 = new Book(
            "test",
            "111-11-111-0000-0",
            new Author(
                    "test",
                    "test"
            ),
            LocalDate.parse("2000-01-01")
    );

    private static final Set<Book> exampleBookData = Set.of(
            BOOK1,
            BOOK2
    );

    public static Set<Book> getExampleBookData() {
        return exampleBookData;
    }

    public static Book getExampleSingleBook() {
        return BOOK1;
    }
}
