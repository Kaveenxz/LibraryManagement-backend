package edu.icet.service;

import edu.icet.dto.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    public void addBook(Book book);
}
