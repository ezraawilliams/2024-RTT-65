package org.ezrawilliams.runner;

import org.ezrawilliams.controller.BookDAOImpl;
import org.ezrawilliams.daointerface.BookDAO;
import org.ezrawilliams.model.Books;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccessBook {
    static  BookDAO bookDao = new BookDAOImpl();
    public static void main(String[] args) {
        //retrieveBooks();
        //updateBookRecord();
        deleteBookRecord();

    }

    public static void insertBooks(){
        // creating object

        System.out.println("--------- inserting book records ----------");

        ArrayList<Books> BookList = new ArrayList<Books>();

        Books b1 = new Books();
        b1.setIsbn(120);
        b1.setBookName("Java Book");
        BookList.add(b1);

        Books b2 = new Books();
        b2.setIsbn(300);
        b2.setBookName("Python Book");
        BookList.add(b2);

        Books b3 = new Books();
        b3.setIsbn(365);
        b3.setBookName("JavaScript Book");
        BookList.add(b3);

        Books b4 = new Books();
        b4.setIsbn(256);
        b4.setBookName("SQL Book");
        BookList.add(b4);

        bookDao.saveBook(BookList);
    }
    public static void retrieveBooks(){
        System.out.println( " ====== Display list of all books ====");
        try {
            for (Books cc : bookDao.getAllBooks()) {
                int ISBN = cc.getIsbn();
                String BookName = cc.getBookName();
                System.out.println("======================");
                System.out.println("ISBN Number :" + ISBN + " and Book name: " + BookName);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void updateBookRecord(){
        System.out.println("----Book information is updating -----");
        Books Bookupdating = new Books();
        Bookupdating.setIsbn(3);
        Bookupdating.setBookName("Algorithms Book");
        boolean result = bookDao.updateBook(Bookupdating, 3);
        System.out.println(result);
    }

    public static void deleteBookRecord(){
        boolean a = bookDao.deleteBook(4); // 4 is a id of book
        if(a == true) {
            System.out.println("Record is deleted");
        }
        else
        {
            System.out.println("Record is not deleted");
        }

    }


}