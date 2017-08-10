package com.example.demo;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Book {

    String author;
    String title;

    public Book(String author, String title){

        this.author = author;
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int hashCode(){

        return Integer.parseInt(title.substring(0,5));
    }

    public boolean equals(Object o){

        Book e = (Book) o;
        return	(author.equals(e.getAuthor())) &&
                (title.equals(e.getTitle()));
    }
}
