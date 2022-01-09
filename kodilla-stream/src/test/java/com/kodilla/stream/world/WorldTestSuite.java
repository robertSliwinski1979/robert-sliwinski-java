package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        BigDecimal namibiaPeople = new BigDecimal("1000000000");
        BigDecimal tanzaniaPeople = new BigDecimal("1000000000");
        BigDecimal somaliaPeople = new BigDecimal("1000000000");
        BigDecimal chinaPeople = new BigDecimal("1000000000");
        BigDecimal japanPeople = new BigDecimal("1000000000");
        BigDecimal malaysiaPeople = new BigDecimal("1000000000");
        BigDecimal polandPeople = new BigDecimal("1000000000");
        BigDecimal germanyPeople = new BigDecimal("1000000000");
        BigDecimal brazilPeople = new BigDecimal("1000000000");
        BigDecimal mexicoPeople = new BigDecimal("1000000000");

        //When
        Continent Africa = new Continent("Africa");
        Africa.addCountry(new Country("Namibia", namibiaPeople));
        Africa.addCountry(new Country("Tanzania", tanzaniaPeople));
        Africa.addCountry(new Country("Somalia", somaliaPeople));

        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Poland", polandPeople));
        Europe.addCountry(new Country("Germany", germanyPeople));

        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("China", chinaPeople));
        Asia.addCountry(new Country("Japan", japanPeople));
        Asia.addCountry(new Country("Malaysia", malaysiaPeople));

        Continent America = new Continent("America");
        America.addCountry(new Country("Brazil", brazilPeople));
        America.addCountry(new Country("Mexico", mexicoPeople));

        //Then
        assertEquals(2, Europe.getQuantityOfCountries());
        assertEquals(3, Asia.getQuantityOfCountries());
        assertEquals(2, America.getQuantityOfCountries());
        assertEquals(3, Africa.getQuantityOfCountries());

        BigDecimal expectedEurope = new BigDecimal("2000000000");
        BigDecimal expectedAsia = new BigDecimal("3000000000");
        BigDecimal expectedAmerica = new BigDecimal("2000000000");
        BigDecimal expectedAfrica = new BigDecimal("3000000000");

        assertEquals(expectedEurope, Europe.getPeopleQuantity());
        assertEquals(expectedAsia, Asia.getPeopleQuantity());
        assertEquals(expectedAfrica, Africa.getPeopleQuantity());
        assertEquals(expectedAmerica, America.getPeopleQuantity());
    }

    @Test
    void testGetQuantityOfAllPeople() {
        //Given
        BigDecimal namibiaPeople = new BigDecimal("1000000000");
        BigDecimal tanzaniaPeople = new BigDecimal("1000000000");
        BigDecimal somaliaPeople = new BigDecimal("1000000000");
        BigDecimal chinaPeople = new BigDecimal("1000000000");
        BigDecimal japanPeople = new BigDecimal("1000000000");
        BigDecimal malaysiaPeople = new BigDecimal("1000000000");
        BigDecimal polandPeople = new BigDecimal("1000000000");
        BigDecimal germanyPeople = new BigDecimal("1000000000");
        BigDecimal brazilPeople = new BigDecimal("1000000000");
        BigDecimal mexicoPeople = new BigDecimal("1000000000");

        Continent Africa = new Continent("Africa");
        Africa.addCountry(new Country("Namibia", namibiaPeople));
        Africa.addCountry(new Country("Tanzania", tanzaniaPeople));
        Africa.addCountry(new Country("Somalia", somaliaPeople));

        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Poland", polandPeople));
        Europe.addCountry(new Country("Germany", germanyPeople));

        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("China", chinaPeople));
        Asia.addCountry(new Country("Japan", japanPeople));
        Asia.addCountry(new Country("Malaysia", malaysiaPeople));

        Continent America = new Continent("America");
        America.addCountry(new Country("Brazil", brazilPeople));
        America.addCountry(new Country("Mexico", mexicoPeople));

        //When
        World world = new World("world");
        world.addContinentToTheWorld(Africa);
        world.addContinentToTheWorld(Asia);
        world.addContinentToTheWorld(Europe);
        world.addContinentToTheWorld(America);

        BigDecimal peopleOfWorldActual = new BigDecimal("10000000000");

        //Then
        assertEquals(peopleOfWorldActual,world.getQuantityOfAllPeople());
    }
}
