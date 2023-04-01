package com.sda.provider;

import com.sda.model.Author;
import com.sda.model.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static com.sda.BookDataFactory.getExampleBookData;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class BookFileProviderTest {

    @Test
    void shouldProvideAllBooksFromFile() {
        //given
        Set<Book> expectedResult = getExampleBookData();
        BookProvider bookProvider = new BookFileProvider("src/test/resources/test_book");
        //when
        Set<Book> result = bookProvider.getAllBooks();
        //then
        assertThat(result).containsAll(expectedResult);
    }

}