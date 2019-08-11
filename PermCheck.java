package codility;

public class PermCheck {
    public static int solution(int[] A) {

        int[] counter = new int [A.length];
        for(int i= 0; i< A.length; i++){
            if (A[i] < 1 || A[i] > A.length) {
                // Out of range
                return 0;
            }
            else if(counter[A[i]-1] == 1) {
                // met before
                return 0;
            }
            else {
                // first time meet
                counter[A[i]-1] = 1;
            }
        }
        return 1;
    }


    public static void main(String[] args) {

        int  A[] = { 7,3,6,2,4,5,1};
        System.out.println( solution(A));
    }


}
