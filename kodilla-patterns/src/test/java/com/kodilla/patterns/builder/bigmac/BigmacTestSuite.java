package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("sezam roll")
                .burgers(4)
                .sauce("BBQ")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Paprika")
                .ingredient("cheese")
                .build();
        //When
        int howMAnyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4,howMAnyIngredients);
    }
}
