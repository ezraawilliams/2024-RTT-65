package org.ezrawilliams.daointerface;
/*
Logic that we want to perform on our objects (aka rows in the table)
Mimic the queries  and other statement that we want to perform
 */

import org.ezrawilliams.model.Books;

import java.util.List;

public interface BookDAO {
    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);
}
