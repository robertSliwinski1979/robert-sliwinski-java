
package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExaminator {

    List <Integer> numbers = new ArrayList<>() ;
    List<Integer> EvenNumbers = new ArrayList<>();
    List <Integer> OddNumbers = new ArrayList<>();



    public List<Integer> examinate (List <Integer> numbers, List<Integer> EvenNumbers, List <Integer> OddNumbers ){

        for(int i = 0; i < numbers.size();i++){
            int num = numbers.get(i);
            if ( num % 2 == 0){
                EvenNumbers.add(num);
            }
        }
        //return numbers %2 == 0 ? List <Integer> EvenNumbers : List <Integer> OddNumbers;

        //return List <Integer> EvenNumbers;
        return EvenNumbers;
    }
}
