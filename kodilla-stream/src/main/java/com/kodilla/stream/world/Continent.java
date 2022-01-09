package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String nameOfContinent;
    private final List<Country> listOfCountries = new ArrayList<>();

    public List<Country> showCountries() {
        return listOfCountries;
    }

    public void addCountry(Country someCountry) {
        listOfCountries.add(someCountry);
    }

    public void removeCountry(Country someCountry) {
        listOfCountries.remove(someCountry);
    }

    public Continent(String name) {
        nameOfContinent = name;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public int getQuantityOfCountries() {
        return listOfCountries.size();
    }

    @Override
    public String toString() {
        return "Continent{" +
                ", nameOfContinent='" + nameOfContinent + '\'' +
                "country=" + listOfCountries +
                '}';
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal total = new BigDecimal("0");

        for (Country allCountries : listOfCountries) {
            total = total.add(allCountries.getPeopleQuantity());
        }
        return total;
    }
}
