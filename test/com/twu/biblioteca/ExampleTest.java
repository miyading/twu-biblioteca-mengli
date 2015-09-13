package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

public class ExampleTest {

    private Library library;
    private Customer customer;

    @Before
    public void setUp() {
        library = new Library();
        customer = new Customer("mengli");
    }

    @Test
    public void library_should_send_welcome_message() {
        library.sendWelcomeMessage(customer);
    }

    @Test
    public void show_main_menu() {
        library.addMainMenu();
        library.showMainMenu();
    }

    @Test
    public void show_all_books() {
        library.addListOfBook();
        library.showAllBooks();
    }

}
