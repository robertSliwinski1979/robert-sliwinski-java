package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
//    private final Country country;
//    private final Continent continent;
    private final String name;
    private final Set<World> mapOfTheWorld = new HashSet<>();


    public World(String name) {
        this.name = name;
    }

//    public Set<World> addContinentToTheWorld(Continent continent) {
//        mapOfTheWorld.add(continent);
//        return mapOfTheWorld;
//    }

//    public Continent getContinent() {
//        return continent;
//    }

    @Override
    public String toString() {
        return "World{" +
              //  "country=" + country +
              //  ", continent=" + continent +
                ", mapOfTheWorld=" + mapOfTheWorld +
                '}';
    }

    //    public List<Country country, BigDecimal bigd> addCountryToContinent(){
//        return continent.addCountry(countrySet);
//    }
    public Set<String> getQuantityOfAllPeople() {

        return mapOfTheWorld.stream()
                //.flatMap(world -> world.continent.getPeopleQuantity())
                .flatMap(continent -> continent.getQuantityOfAllPeople().stream())    //error
                .collect(Collectors.toSet());   //error
    }
}
