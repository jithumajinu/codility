package codility;

import java.util.Arrays;

public class RecursionCyclicRotation {


    public static int[] solution(int[] A, int K) {

        if (K == 0 || K == A.length || A.length ==0 )
            return A;
        else{
            int i, temp = A[A.length-1];        // rotated index

            for (i = A.length-1; i > 0 ; i--)
                A[i] = A[i - 1];
            A[i] = temp;
            return(solution(A,K-1));
        }

    }


    public static int[] solution3(int[] A, int K) {
        int [] sol = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            sol[(i + K) % A.length] = A[i];
        }
        return A;
    }



    public static int[] solution2(int[] A, int K) {
        int [] rotatedA = new int[A.length];

        for(int i=0; i<A.length; i++) {
            //rotated index needs to "wrap" around end of array
            int rotatedIndex = (i + K) % A.length;

            System.out.println(rotatedIndex);

            rotatedA[rotatedIndex] = A[i];
        }
        return rotatedA;
    }

    public static void main(String[] args) {

        int A[] = {4,6,8,9};

       // solution2(A,2);
      //  Arrays.stream( solution(A,2)).forEach(num -> System.out.print(num));
        Arrays.stream( solution2(A,2)).forEach(num -> System.out.print(num));


    }

    }
