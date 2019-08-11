package codility;

import java.util.Arrays;
public class tapeequilibrium_arraySplict {

    public static int solution(int[] A) {

       // long sumAllElements = Arrays.stream(A).sum();
        long sumAllElements = 0;
        for(int i=0; i<A.length; i++) {
            sumAllElements += A[i];
        }
        int minDifference = Integer.MAX_VALUE;
        int currentDifference;
        long sumLeft = 0;

        for(int p=0; p<A.length-1; p++) {
            sumLeft += A[p];
            currentDifference = (int) Math.abs(sumLeft - (sumAllElements - sumLeft));
            minDifference = Math.min(currentDifference, minDifference);
        }
        return minDifference;
    }

    /*
     for(int p=0; p<A.length-1; p++) {
            sumLeft += A[p];
           // sumRight = sumAllElements - sumLeft;
            currentDifference = (int) Math.abs(sumLeft - sumRight);
            minDifference = Math.min(currentDifference, minDifference);
        }
     */

    public static void main(String[] args) {

        int  A[] = { 3,1,2,4,3};
        System.out.println( solution(A));
    }
}
