package com.Basic;

import java.util.ArrayList;

class Book{
    public String name, author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book  " + book +"   has been added to library");
        this.books.add(book);
    }
    public void issueBook(Book book , String issue_to){
        System.out.println("The book  " + book + "  has been issued from library to " + issue_to);
        this.books.remove(book);
    }
    public void returnBook(Book b, String return_by){
        System.out.println("The book  " + b + "  has been returned by " +   return_by);
        this.books.add(b);
    }

}

public class CWH_104_Ex7 {
    public static void main(String[] args) {
        /*
        Create a library Management system whic is capable of issuing books to the student
        Books you have info like:
        1. Book Name
        2.Book Author
        3.Issued to ,
        4. Issued on
        User should be able to add book ,return issued book , issued book
        Assume that all the user are registered with their name in central library
         */

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithm1", "Dk1");
        bk.add(b1);
        Book b2=new Book("Algorithm2", "Dk2");
        bk.add(b2);
        Book b3 =new Book("Algorithm3", "Dk3");
        bk.add(b3);
        Library l = new Library(bk);
        System.out.println(l.books);
        l.addBook(new Book("Algorithm5", "Dk5"));
        System.out.println(l.books);
        l.issueBook(b1, "Dhiraj");
        System.out.println(l.books);
        l.returnBook(b1, "Dhiraj");
        System.out.println(l.books);
    }
}
