package com.kodilla.hibernate.invoice;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    int id;
    String number;
    List<Item> items = new ArrayList<>();
}
