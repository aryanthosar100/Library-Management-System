package com.library.library.service;

import com.library.library.model.Book;
import com.library.library.model.Borrow;
import com.library.library.repository.BookRepository;
import com.library.library.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BorrowService {

    @Autowired
    private BorrowRepository borrowRepo;

    @Autowired
    private BookRepository bookRepo;

    // ISSUE BOOK
    public Borrow issueBook(int bookId, String userName) {

        Book book = bookRepo.findById(bookId).orElse(null);

        if (book == null) {
            throw new RuntimeException("Book not found");
        }

        if (!book.isAvailable()) {
            throw new RuntimeException("Book already borrowed");
        }

        book.setAvailable(false);
        bookRepo.save(book);

        Borrow borrow = new Borrow();
        borrow.setBookId(bookId);
        borrow.setUserName(userName);
        borrow.setBorrowDate(LocalDate.now());
        borrow.setReturnDate(null);

        return borrowRepo.save(borrow);
    }

    // ✅ RETURN BOOK
    public Borrow returnBook(int borrowId) {

        Borrow borrow = borrowRepo.findById(borrowId).orElse(null);

        if (borrow == null) {
            throw new RuntimeException("Borrow record not found");
        }

        // set return date
        borrow.setReturnDate(LocalDate.now());

        // make book available again
        Book book = bookRepo.findById(borrow.getBookId()).orElse(null);
        if (book != null) {
            book.setAvailable(true);
            bookRepo.save(book);
        }

        return borrowRepo.save(borrow);
    }
}