
package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExaminator {

    public List<Integer> exterminate(List <Integer> numbers ){
        List<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.size();i++){
            int num = numbers.get(i);
            if ( num % 2 == 0){
                evenNumbers.add(num);
            }
        }

        return evenNumbers;
    }
}
