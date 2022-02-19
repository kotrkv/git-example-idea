package com.kotrkv.controller;

import com.kotrkv.model.Book;
import com.kotrkv.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class BookController {

    private BookService bookService;

    @GetMapping
    public Mono<List<Book>> books() {
        return Mono.defer(() -> bookService.books());
    }
}
