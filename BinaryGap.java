package codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    @FunctionalInterface
    interface MyGeneric<T> {
        T compute(T t);
    }

    public static int solution(int N) {

        MyGeneric<Integer> reverse = (num) -> {
            String binaryString = Integer.toBinaryString(num);
            int longestBinaryGap = 0;
            List onesList = new ArrayList();
            for(int i=0; i<binaryString.length(); i++) {
                if(binaryString.charAt(i) == '0') continue;
                onesList.add(i);
            }
            for(int i=0; i<onesList.size() - 1; i++) {
                //subtract 1 so that don't count 1's next to each other as having any gap
                int indicesDiff = (int) onesList.get(i+1) -  (int)onesList.get(i) - 1;
                longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
            }
            return longestBinaryGap;
        };
        return reverse.compute(N);
    }

    public static void main(String[] args) {

        System.out.println( solution(9));

    }


}