package codility;

public class FrogJmp {


    public static int solution(int X, int Y,int K) {
      /*  int jump = 0;

       jump = ((Y-X)%K);
       double doubleNumber =  ((Y-X)%K);
       int intPart = (int) doubleNumber;
       System.out.println(doubleNumber - intPart);
      */
        return(((Y-X)%K)==0?((Y-X)/K):((Y-X)/K)+1);
    }

    public static void main(String[] args) {



        System.out.println( solution(10,90,20));


    }

}
