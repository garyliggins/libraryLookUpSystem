package com.kenzie.library.model;

import java.sql.Array;
import java.util.Arrays;

//TODO: Complete LibraryBook class by extending Book and adding required elements
public class LibraryBook extends Book  {
    //properties
    private String isbn;

   private String subjectList;


   //constructors
   public LibraryBook() {
       isbn = "";
       subjectList = "";
    }

  public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
      isbn = "";
      subjectList = "";
    }

    //methods


    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + title + '\'' +  ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", subjectList='" + subjectList + '\'' +
                '}';
    }
    @Override
    public void setBookInfo(String detailString) {
        String[] getValues = detailString.split("\\|");
        System.out.println(Arrays.toString(getValues));
        /*
        * private String isbn;

   private String subjectList;
        * */
        this.title = getValues[0];
        this.author = getValues[1];
        isbn = getValues[2];
        subjectList = getValues[3];
    }

    //getters and setters


    //getter
    public String getIsbn() {
        return isbn;
    }

    //setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //getter
    public String getSubjectList() {
        return subjectList;
    }

    //setter
    public void setSubjectList(String subjectList) {
        this.subjectList = subjectList;
    }

}