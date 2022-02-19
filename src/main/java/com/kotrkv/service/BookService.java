package com.kotrkv.service;

import com.kotrkv.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<Book> books() {
        return List.of(new Book(1L, "Букварь"));
    }
}
