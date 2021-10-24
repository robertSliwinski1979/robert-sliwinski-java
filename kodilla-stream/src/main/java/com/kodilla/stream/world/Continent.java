package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    //private final Country country;
    private final String nameOfContinent;
    private final List<Country> listOfCountries = new ArrayList<>();

    public void addCountry(Country someCountry) {
        listOfCountries.add(someCountry);
    }

    public void removeCountry(Country someCountry) {
        listOfCountries.remove(someCountry);
    }

    public Continent(String name) {
        nameOfContinent = name;
    }

//    public Country getCountry() {
//        return this.country;
//    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public int getQuantityOfCountries() {
        return listOfCountries.size();
    }

    @Override
    public String toString() {
        return "Continent{" +
                //   "country=" + country.getNameOfCountry() +
                ", nameOfContinent='" + nameOfContinent + '\'' +
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
