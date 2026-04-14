package com.library.library.controller;

import com.library.library.model.Book;
import com.library.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        service.deleteBook(id);
        return "Deleted Successfully";
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title) {
        return service.searchByTitle(title);
    }
}