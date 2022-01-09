package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final String name;
    private final Set<Continent> mapOfTheWorld = new HashSet<>();

    public World(String name) {
        this.name = name;
    }

    public void addContinentToTheWorld(Continent continent) {
        mapOfTheWorld.add(continent);
    }

    @Override
    public String toString() {
        return "World{" +
                ", mapOfTheWorld=" + mapOfTheWorld +
                '}';
    }

    public BigDecimal getQuantityOfAllPeople() {
        return mapOfTheWorld.stream()
                .flatMap(continent -> continent.showCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
