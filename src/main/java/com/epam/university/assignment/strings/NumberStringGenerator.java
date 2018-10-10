package com.epam.university.assignment.strings;

import com.epam.university.assignment.numbers.NumberGenerator;

public class NumberStringGenerator {

    private NumberGenerator numberGenerator;

    public NumberStringGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public String[] generateString(int numberPairCount,int max){
        String[] result = new String[numberPairCount];
        //  Indexing starts from 0 in java
        for(int i=0;i<numberPairCount;i++){
            String element = numberGenerator.generateEven(max)+","+numberGenerator.generateOdd(max);
            result[i]=element;
        }
        return result;
    }

}
