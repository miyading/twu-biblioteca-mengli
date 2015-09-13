package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Customer customer = new Customer("mengli");
        Library library = new Library();
        library.addListOfBook();

        library.sendWelcomeMessage(customer);

        library.addMainMenu();
        library.showMainMenu();

        library.selectOption();

    }
}
