package edu.icet.controller;

import edu.icet.dto.Book;
import edu.icet.entity.BookEntity;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@CrossOrigin
public class BookController {

    final BookService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }

    @GetMapping("/get")
    public Iterable<BookEntity> getBooks(){
        return service.getBooks();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteBook(@PathVariable Long id){
         service.deleteBook(id) ;
         return "delete";

    }

    @GetMapping("serch/{id}")
    public Book getBookBuId(@PathVariable Long id){
        return service.getBookById(id);
    }

}


