package com.java.Compostion;
import java.io.*;
import java.util.*;

public class Book {

    // Attributes of book
    public String title;
    public String author;

    // Constructor of Book class
    Book(String title, String author)
    {

        // This keyword refers to current instance itself
        this.title = title;
        this.author = author;
    }
}
