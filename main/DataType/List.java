package DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {
    public static void main(String[] args) {
    /**
     * 리스트의 자료형에서 일반적으로 사용하는 ArrayList 실습, 이외도 Vector, LinkedList가 있다.
     */

        // add
        ArrayList pitches = new ArrayList();
        pitches.add("130");
        pitches.add("120");
        pitches.add("150");
        System.out.println(pitches.get(1));

        // size
        System.out.println(pitches.size());

        // contains
        System.out.println(pitches.contains(130));

        // remove (객체 방식)
        System.out.println(pitches.remove("130")); // 리스트에서 삭제 후 true 리턴

        // remove (인덱스 방식)
        System.out.println(pitches.remove(1)); // 120을 삭제하고 삭제한 값을 리턴

        /*메서드 사용 끝*/

        /**
         * 제네릭스는 자료형을 안전하게 사용할 수 있도록 만들어 주는 기능, 자료형을 강제로 캐스팅 할 떄 생길 수 있는 캐스팅 오류 줄이는 용도
         */

        // 제네릭스 미 사용
        ArrayList list = new ArrayList();
        list.add("1234");
        list.add("5678");

        String one = (String) list.get(0);
        String two = (String) list.get(1);
        System.out.println(one + two);
        System.out.println(list);

        //제네릭스 적용
        ArrayList<String> strList = new ArrayList<>();
        strList.add("123");
        strList.add("456");

        // 제네릭스 사용으로 인하여 캐스팅이 필요하지 않다.
        String strOne = strList.get(0);
        String strTwe = strList.get(1);
        System.out.println(strList);

        // 문자열 배열 활용하여 ArrayList 생성
        String[] data = {"123","456","789"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(data));
        System.out.println(arr);

        // 이런식으로 바로  값을 넣어 생성도 가능.
        ArrayList<String> pitched = new ArrayList<>(Arrays.asList("123","456","789"));
        System.out.println(pitched);

        //String.join
        String joiner = String.join(", ", pitched);
        System.out.println(joiner);

        // 리스트 정렬하기
        ArrayList<String> sorted = new ArrayList<>(Arrays.asList("154","123","169"));
        sorted.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println(sorted);
    }
}
