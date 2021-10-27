package com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 3, -1, 3, 4, -1};
        System.out.println(sumOfRepeated(array1));

    }

    public static int sumOfRepeated(int[] array) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i],0) +1);
            if(map.get(array[i]) == 2){
                sum += array[i];
            }
        }
        return sum;
    }
}

