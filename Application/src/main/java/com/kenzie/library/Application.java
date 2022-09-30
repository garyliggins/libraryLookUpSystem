package com.kenzie.library;

//import dependencies
import com.kenzie.library.book.service.BookRequestService;
import com.kenzie.library.logger.service.Logger;
import com.kenzie.library.model.LibraryBook;

import java.util.ArrayList;



public class Application {

    //TODO: Remove comments and complete method to convert a single response string to LibraryBook
    public static LibraryBook convertResponseToLibraryBook(String response){
        // 3. Write a public static method convertResponseToLibraryBook() in Appplication.java
        //      a. the method takes in a response string
        //      b. instantiate a LibraryBook object
        LibraryBook book = new LibraryBook();
        book.setBookInfo(response);
        //      c. use the response string to set book info
        //      d. return the LibraryBook object
        return book;

    }

//    TODO: Remove comments and complete method to return ArrayList of LibraryBook
    public static ArrayList<LibraryBook> returnBookList(String response1, String response2, String response3, String response4, String response5) {
//      b. within the method, instantiate the LibraryBook objects
        LibraryBook book2 = new LibraryBook();
        book2.setBookInfo(response1);

        LibraryBook book3= new LibraryBook();
        book3.setBookInfo(response2);

        LibraryBook book4= new LibraryBook();
        book4.setBookInfo(response3);

        LibraryBook book5= new LibraryBook();
        book5.setBookInfo(response4);

        LibraryBook book6= new LibraryBook();
        book6.setBookInfo(response5);

//      c. Add the LibraryBook objects to an ArrayList<LibraryBook>
        ArrayList<LibraryBook> bookList = new ArrayList<>();
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        System.out.println(bookList);
//      d. return the Arraylist<LibraryBook>
        return bookList;

//5. Call the returnBookList() and print the results with System.out.println()
//        to make sure the method works and toString() is overridden.
//6. User Logger to log: "Process complete"
//7. Unit Test your code with LibraryBookTest.java and ApplicationTest.java
    }

    public static void main(String[] args) {


        //Use these constant values as input
        final String BOOK_1 = "The Hobbit|J.R.R. Tolkien||";
        final String BOOK_2 = "Dune|Frank Herbert||";
        final String BOOK_3 = "The Nonsense Book|Mr. Myzlplk||";
        final String BOOK_4 = "The Cat in the Hat|Dr. Seuss||";
        final String BOOK_5 = "The Art of War|Sun Tzu||";
        ArrayList<LibraryBook> GetBooks = returnBookList(BOOK_1,BOOK_2,BOOK_3,BOOK_4, BOOK_5);
        System.out.println(GetBooks.toString());

        try {
            Logger log = Logger.getInstance();
            log.logMessage("Process starting");

            //Write code inside this try/catch block
            //1. Instantiate Singleton Logger object to log: "Process starting"

            //2. Repeat for all five books listed (you do not need to loop):
            //      a. Call BookRequestService.sendGetRequest()
            //      b. Get the String response as the return value
            //      c. Use Logger to log each response string
           String response1 =  BookRequestService.sendGetRequest(BOOK_1);
           log.logMessage((response1));

            String response2 =  BookRequestService.sendGetRequest(BOOK_2);
            log.logMessage((response2));

            String response3 =  BookRequestService.sendGetRequest(BOOK_3);
            log.logMessage((response3));

            String response4 =  BookRequestService.sendGetRequest(BOOK_4);
            log.logMessage((response4));

            String response5 =  BookRequestService.sendGetRequest(BOOK_5);
            log.logMessage((response5));





            // 4. Write a public static method returnBookList() in Application.java
            //      a. the method takes in 5 formatted Strings
            //      b. within the method, instantiate the LibraryBook objects
            //      c. Add the LibraryBook objects to an ArrayList<LibraryBook>
            //      d. return the Arraylist<LibraryBook>
            //5. Call the returnBookList() and print the results with System.out.println()
            //        to make sure the method works and toString() is overridden.
            //6. User Logger to log: "Process complete"
            //7. Unit Test your code with LibraryBookTest.java and ApplicationTest.java

    }
        catch (Exception e){
            System.out.println("Error occurred: unable to request book info");
            System.out.println("Exception info:" + e.getMessage());
        }
    }

}
