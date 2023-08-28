package Functional;

import java.util.Arrays;
import java.util.Comparator;

public class exStream {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data) // create IntStream
                .boxed() // IntStream to Stream<Integer>
                .filter((a) -> a % 2 == 0) // 짝수만 추출
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder()) // reverse sort
                .mapToInt(Integer::intValue) // Stream<Integer> to IntStream
                .toArray(); // int [] 배열로 반환.
    }
}
