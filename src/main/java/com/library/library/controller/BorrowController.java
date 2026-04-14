package com.library.library.controller;

import com.library.library.model.Borrow;
import com.library.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    private BorrowService service;

    @PostMapping
    public Borrow issueBook(@RequestParam int bookId, @RequestParam String userName) {
        return service.issueBook(bookId, userName);
    }

    @PutMapping("/return/{borrowId}")
    public Borrow returnBook(@PathVariable int borrowId) {
        return service.returnBook(borrowId);
    }
}