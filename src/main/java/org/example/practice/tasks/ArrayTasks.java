package org.example.practice.tasks;

import java.util.*;

public class ArrayTasks {

    public static void main(String[] args) {
        String[] A = new String[]{"a", "a", "t", "e", "f", "i", "j"};
        String[] B = new String[]{"t", "g", "g", "i", "k", "f"};

        System.out.println(Arrays.toString(differenceBetweenTwoArrays(A, B)));
    }

    /*
      A = [a, a, t, e, f, i, j]
      B = [t, g, g, i, k, f]
      difference = [a, e, g, j, k]
    */
    public static String[] differenceBetweenTwoArrays(String[] firstArray, String[] secondArray) {
        String[] resultArr = new String[firstArray.length+ secondArray.length];
        int index = 0;

        for (int i=0; i<firstArray.length; i++) {
            for (int j=0; j<secondArray.length ; j++) {
                if (firstArray[i].equals(secondArray[j])) {
                    firstArray[i] = null;
                    secondArray[j] = null;
                    break;
                }
            }
        }

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.stream(firstArray).toList());
        set.addAll(Arrays.stream(secondArray).toList());

        for (String s : set) {
            if (s != null) {
                resultArr[index++] = s;
            }
        }



        return set.toArray(new String[0]);
    }

    /*
        123 => [1,2,3]
        1 => [1]
        8675309 => [8,6,7,5,3,0,9]
    */
    public int[] numberToArray(int number) {

        return new int[0];
    }


    /*
        n = 0  ==> [1]        # [2^0]
        n = 1  ==> [1, 2]     # [2^0, 2^1]
        n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
    */
    public long[] powersOf2(int n) {
        return new long[0];
    }

    /*
        1.A=[1,2,3,4]⇒D=[1,1,1]
        2.A=[1,3,4,10]⇒D=[2,1,6]
    */
    public int[] maximumDifferentDifferences(int[] source) {
        return new int[0];
    }
}
