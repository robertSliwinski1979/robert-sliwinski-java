package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

    @Bean
    public Library library() {
        return new Library(libraryDbController());
    }

    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}
/*
Metoda libraryDbController() tworzy obiekt, który jest wstrzykiwany do obiektu
tworzonego przy pomocy metody library(). Zwróć uwagę, że wewnątrz metody library()
następuje wywołanie konstruktora new Library(libraryDbController()), gdzie w jawny
sposób wskazujemy, że do utworzenia obiektu klasy Library należy użyć obiektu klasy
LibraryDbController utworzonego przez metodę libraryDbController() – następuje jawne
wstrzyknięcie przez konstruktor (nieautomatyczne).

W tym miejscu ważne jest, aby znad klas LibraryDbController oraz Library usunąć adnotacje
@Component oraz adnotacje pokrewne, tzn. @Service, @Controller oraz @Repository.
Konfiguracja przy pomocy klasy konfiguracyjnej oraz konfiguracja przy pomocy adnotacji to dwa
różne sposoby konfigurowania tego samego. Spring nie wiedziałby której konfiguracji użyć,
gdyby pozostały obydwie.
 */