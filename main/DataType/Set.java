package DataType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
        System.out.println(set); //[e, H, l, o]

        /**
         * 집합 자료형의 2가지 특징
         * 1. 중복을 허용하지 않음.
         * 2. 순서가 없음.
         */

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        /** 교집합 구하기 */
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2); // 교집합 수행
        System.out.println(intersection); // [4, 5, 6]

        /** 차집합 구하기 */
        HashSet<Integer> intersections = new HashSet<>(s1);
        intersections.removeAll(s2);
        System.out.println(intersections);

        /** addAll */
        HashSet<String> sets = new HashSet<>();
        sets.add("Jump");
        sets.addAll(Arrays.asList("To", "Java"));
        System.out.println(sets);

        /** remove */
        sets.remove("To");
        System.out.println(sets);

    }
}
