package com.library.library.service;

import com.library.library.model.Book;
import com.library.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book addBook(Book book) {
        return repo.save(book);
    }

    public void deleteBook(int id) {
        repo.deleteById(id);
    }

    public Book updateBook(int id, Book book) {
        return repo.findById(id).map(existingBook -> {
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setCategory(book.getCategory());
            existingBook.setAvailable(book.isAvailable());
            return repo.save(existingBook);
        }).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    // ✅ SEARCH METHOD
    public List<Book> searchByTitle(String title) {
        return repo.findByTitleContaining(title);
    }
}