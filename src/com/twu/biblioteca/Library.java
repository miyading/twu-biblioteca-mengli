package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mlding on 9/13/15.
 */
public class Library {

    private List<Book> bookList = new ArrayList<>();
    private List<String> optionList = new ArrayList<>();

    public void sendWelcomeMessage(Customer customer) {
        System.out.println("Welcome to Biblioteca, " + customer.getName());
    }

    public void addMainMenu() {
        optionList.add("1(List Books)");
        optionList.add("2(Check-out Book)");
        optionList.add("3(Return Book)");
    }

    public void showMainMenu() {
        System.out.println("Options: ");
        for (String option : optionList) {
            System.out.print(option + "    ");
        }
        System.out.println("\n");
    }

    public void selectOption() {
        Scanner scanner = new Scanner(System.in);
        String optionNum;
        while (true) {
            optionNum = scanner.next();
            if (optionNum.equals("Quit")) break;
            switch (optionNum) {
                case "1":
                    showAllBooks();
                    break;
                case "2":
                    checkoutBook();
                    break;
                case "3":
                    returnBook();
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
        }
    }

    public void addListOfBook() {
        bookList.add(new Book("123", "java", "arron", new Date()));
        bookList.add(new Book("124", "C", "crystal", new Date()));
        bookList.add(new Book("125", "C++", "miya", new Date()));
        bookList.add(new Book("126", "JS", "dingding", new Date()));
        bookList.add(new Book("127", "Jquery", "lisa", new Date()));
    }

    protected void showAllBooks() {
        for (Book book : bookList) {
            System.out.println("BookId: " + book.getBookId() + "   BookName: " + book.getName() + "   AuthorName: " + book.getAuthorName() + "   PublishDate: " + book.getPublishDate());
        }
    }

    protected void checkoutBook() {
        Scanner scanner = new Scanner(System.in);
        String bookNum;
        while (true) {
            System.out.println("please enter the id of the check-out book: ");
            bookNum = scanner.next();
            if (isExsitCheckOutBook(bookNum)) {
                bookList.remove(bookNum);
                System.out.println("Thank you! Enjoy the book.");
                break;
            } else {
                System.out.println("That book is not available.");
            }
        }
    }

    private void returnBook() {
        Scanner scanner = new Scanner(System.in);
        String bookNum;
        while (true) {
            System.out.println("please enter the return book: ");
            bookNum = scanner.next();
            if (isExsitCheckOutBook(bookNum)) {
                bookList.add(new Book(bookNum));
                System.out.println("Thank you for returning the book.");
                break;
            } else {
                System.out.println("That is not a valid book to return.");
            }
        }
    }

    private boolean isExsitCheckOutBook(String bookNum) {
        for (Book book : bookList) {
            if (book.getBookId().equals(bookNum)) {
                return true;
            }
        }
        return false;
    }
}
