package DataType;

import java.util.Arrays;

public class str {
    public static void main(String[] args) {

        // 문자열 내장 메서드 equals
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        // 동등 비교 연산자로 확인
        String z = "hello";
        String x = new String("hello");
        System.out.println(z.equals(x)); // true
        System.out.println(z == x); // false

        // index Of (특정 문자열이 시작하는 위치(인덱스))
        String s = "Hello Java";
        System.out.println(s.indexOf("Java")); // 6 출력

        // contains (포함 여부)
        String q = "Hello Java";
        System.out.println(q.contains("Java")); // true

        //charAt (특정 위치의 문자 리턴)
        String k = "Hello Java";
        System.out.println(k.charAt(6));

        //replaceAll (문자열 대치 교체)
        String change = "Hello Java";
        System.out.println(change.replaceAll("Java", "world"));

        //substring (문자열에서 특정 문자열 추출)
        String str = "Hello Java";
        System.out.println(str.substring(0, 4));

        //toUpperCase (소문자 -> 대문자 변경)
        String upper = "Hello Java";
        System.out.println(upper.toUpperCase());

        //toLowerCase (소문자 -> 대문자 변경)
        String lower = "Hello Java";
        System.out.println(lower.toLowerCase());

        //split (문자열 구분자로 나누어 배열로 리턴)
        String split = "a:b:c:d";
        String[] result = split.split(":"); // [a, b, c, d]
        System.out.println(Arrays.toString(result));

        // 문자열 포매팅 - 숫자 바로 대입하기
        System.out.println(String.format("I eat %d apples. ", 3));

        // 문자열 포매팅 - 문자열 바로 대입하기
        System.out.println(String.format("I eat %s apples. ", "five"));
    }


}
