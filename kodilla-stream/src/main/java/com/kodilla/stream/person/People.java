package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList(){
        final List<String> theList = new ArrayList<String>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Lobkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Chloe Fry");
        theList.add("Martin Valenzuela");

        return new ArrayList<>(theList);
    }
}
