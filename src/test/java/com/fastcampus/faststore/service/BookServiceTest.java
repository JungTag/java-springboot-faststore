package com.fastcampus.faststore.service;

import com.fastcampus.faststore.entity.Book;
import com.fastcampus.faststore.entity.BookSale;
import com.fastcampus.faststore.entity.DiscountPolicy;
import com.fastcampus.faststore.repository.BookRepository;
import com.fastcampus.faststore.type.DiscountType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookRepository bookRepository;

    private BookService bookService;

    @BeforeEach
    public void setup() {
        bookService = new BookService(bookRepository);
    }

    @AfterEach
    public void tearDown() {
        bookRepository.deleteAll();
    }

    // TODO: getOrThrow 테스트 코드를 작성하세요.
    @Test
    public void getOrThrow() {
        Book book = new Book("자바의 정석", "남궁성", 30000L);
        bookRepository.save(book);

        Book result = bookService.getOrThrow("자바의 정석");

        assertThat(result).isNotNull();
        assertThat(result.getTitle()).isEqualTo(book.getTitle());
        assertThat(result.getAuthor()).isEqualTo(book.getAuthor());
        assertThat(result.getPrice()).isEqualTo(book.getPrice());

        assertThatThrownBy(() -> bookService.getOrThrow("데이타베이스 시스템"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("해당 제목의 책이 존재하지 않습니다.");
    }

    @Test
    public void registerBook() {
        Book book = new Book("자바의 정석", "남궁성", 30000L);

        bookService.registerBook(
                book.getTitle(),
                book.getAuthor(),
                book.getPrice()
        );

        Book result = bookService.getOrThrow("자바의 정석");

        assertThat(result).isNotNull();
        assertThat(result.getTitle()).isEqualTo(book.getTitle());
        assertThat(result.getAuthor()).isEqualTo(book.getAuthor());
        assertThat(result.getPrice()).isEqualTo(book.getPrice());

        assertThatThrownBy(() -> bookService.registerBook("자바의 정석", "남궁성", 3000L))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("이미 동일한 제목의 책이 존재합니다.");
    }
}
