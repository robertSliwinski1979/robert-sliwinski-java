package com.kodilla.stream.sand;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SandStorageTestSuite {

    @Test
    void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage a1 : continents) {
            totalSand = totalSand.add(a1.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }
    @Test
    void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());

        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current)); // [3]
        //W linii [3] wywołujemy kolektor skalarny reduce(identity, BinaryOperator accumulator),
        // który jako wartość początkową otrzymuje BigDecimal.ZERO,
        // a następnie dla każdej liczby w kolekcji wykonuje wyrażenie lambda
        // (sum, current) -> sum = sum.add(current),
        // gdzie sum jest wynikiem pośrednim uzyskanym dla poprzedniego obiektu w kolekcji
        // (na początku przy pierwszym elemencie jest to BigDecimal.ZERO,
        // czyli wartość początkowa identity).
        // Wyrażenie lambda przypisuje do zmiennej sum nową wartość będącą sumą dotychczasowych obliczeń i wartości current,
        // reprezentującej bieżący obiekt w strumieniu.
        // Po dokonaniu obliczenia – wartość ta będzie przekazana do "następnego przebiegu" kolektora jako nowa wartość pośrednia.
        // Na końcu – po zakończeniu działania kolektora – obliczona suma jest zwracana do zmiennej totalSand.

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }
}
