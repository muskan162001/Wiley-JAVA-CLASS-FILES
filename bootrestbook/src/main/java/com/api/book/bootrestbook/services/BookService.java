package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.book.bootrestbook.entities.Book;

//@Component for autowired
@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(4875, "Java foundation", "XYZ"));
        list.add(new Book(12, "Java Head", "ABC"));
        list.add(new Book(13, "Java Break", "LMN"));
    }

    //get all books
    public List<Book> getAllBooks() {
        return list;
    }

    //get single book by id
    public Book getBookById(int id) {
        Book book = null;
        book = list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }

    //adding the book
    public Book addBook(Book b) {
        list.add(b);
        return b;
    }

    //delete book
    public void deleteBook(int bid) {
        list = list.stream().filter(book->book.getId()!= bid
        ).collect(Collectors.toList());
    }

    //update book 
    public void updateBook(Book book, int bookId) {
       // list = list.stream().filter(book->book.getId())
       list.stream().map(b->{
        if(b.getId() == bookId){
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
        }
        return b;
       }).collect(Collectors.toList());    
    }

}
