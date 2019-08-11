package codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElem {

    public static int solution(int A[]) {
        if(A.length == 0) return 1;
        int sumArr = 0;
        for(int i=0; i < A.length; i++){
            sumArr = sumArr + A[i];
        }
        int sumN = 0;
        for(int i=1; i <= A.length+1; i++){
            sumN = sumN + i;
        }
        if(sumArr == sumN)  return A.length;
        return  sumN - sumArr;
    }


    @FunctionalInterface
    interface MyGeneric {
        int compute(int ar1[]);
    }

    public static int solution2(int A[]) {
        MyGeneric arrraySum = (array) -> {
            int sumArr =0;
            for(int i=0; i < array.length; i++){
                sumArr = sumArr + array[i];
            }
            return sumArr;
        };

        MyGeneric arrrayIndexSum = (array) -> {
            int sumN = 0;
            for (int i = 1; i <= array.length + 1; i++) {

                sumN = sumN + i;
            }
            return sumN;
        };


        if(A.length == 0) return 1;

        int N1 = arrraySum.compute(A);
        int N2 = arrrayIndexSum.compute(A);
        if(N1 == N2)  return A.length;

        return  N2 - N1;
    }


    public static void main(String[] args) {

        int  A[] = { 2,5,4,1, 6, 9, 7, 8};
        System.out.println( solution(A));
        System.out.println( solution2(A));
    }
}
