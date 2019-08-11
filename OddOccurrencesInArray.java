package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class OddOccurrencesInArray {


    interface MyGeneric<T> {
        int compute(Class<T> c);
    }

    // Time: O(N)
    // Space: O(1)
    public static int solution(int[] A) {


        // write your code in Java SE 8
        int elem = 0;
        //   9, 3, 9, 3, 9, 7, 9

        for (int i = 0; i < A.length; i++) {
            System.out.print(elem+"^"+A[i]);
            elem =elem ^ A[i];

            System.out.print("="+elem);
            System.out.println("----");
        }
        return elem;
    }

    // Time: O(N)
    // Space: O(N)
    public static int solution2(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> dups = new HashSet<Integer>();
        int elem = -1;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (dups.add(A[i])) {
                System.out.print("-Y");
                elem = A[i];

            }
            System.out.println("-----------");
        }
        return elem;
    }



    public static int solution4(int[] A) {
        // write your code in Java SE 8

        // Using the concept of "XOR" (^)
        // when there is a pair A and B
        // A^B will be zero
        // A^B^C (where C is not paired),
        // then A^B^C = C

        // special case
        if (A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0]; // initial

        for (int i = 1; i < A.length; i++) {
            unpaired = unpaired ^ A[i]; // xor
        }

        return unpaired; // return the unpaired value
    }



    // Time: O(N^2)
    // Space: O(1)
    public static int solution3(int[] A) {
        // write your code in Java SE 8
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j] && i != j) {
                    A[i] = -1;
                    A[j] = -1;
                    j = A.length;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != -1)
                return A[i];
        }

        return 0; // should never happen
    }

    public static void main(String[] args) {

     //   System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));

     //   System.out.println("="+solution(new int[] { 9, 3, 5, 3, 1,7, 1,7,9,11 }));

        System.out.println(solution(new int[] { 9, 7, 9, 7, 9, 7, 9 }));

    }


}
