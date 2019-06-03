package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        Integer[] output = new Integer[ints.length];
        int index = 0;
        for(int elements : ints) {
            if(elements % 2 != 0) {
                output[index] = elements;
                index++;
                //System.out.println(index);
            }
        }

            //System.out.println(output);
            return output;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] output = new Integer[ints.length];
        int index = 0;
        for(int elements : ints) {
            if(elements % 2 ==0) {
                output[index] = elements;
                index++;
            }
        }
        return output;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        return null;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {

        return null;
    }
}
