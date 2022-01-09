package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {
    LOW(new BigDecimal(250), new BigDecimal(350)),
    HIGH(new BigDecimal(320), new BigDecimal(400)),
    HOLIDAY(new BigDecimal(400), new BigDecimal(500));

    private BigDecimal singleRoomPrice;
    private BigDecimal doubleRoomPrice;

    // konstruktor jest zawsze private, nie musimy pisać tego
    Season(BigDecimal singleRoomPrice, BigDecimal doubleRoomPrice) {
        this.singleRoomPrice = singleRoomPrice;
        this.doubleRoomPrice = doubleRoomPrice;
    }

    //gettery
    public BigDecimal getSingleRoomPrice() {
        return singleRoomPrice;
    }

    public BigDecimal getDoubleRoomPrice() {
        return doubleRoomPrice;
    }
}
