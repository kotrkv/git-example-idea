package com.kotrkv.service;

import com.kotrkv.model.Book;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class BookService {
    public Mono<List<Book>> books() {
        return Mono.just(List.of(new Book(1L, "Букварь")));
    }
}
