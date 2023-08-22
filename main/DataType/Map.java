package DataType;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        /** HashMap */
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));

        /** getOrDefault*/
        System.out.println(map.get("java")); // null return
        System.out.println(map.getOrDefault("java","자바"));

        /** containsKey */
        System.out.println(map.containsKey("people")); // true

        /** remove */
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("people", "사람");
        map2.put("baseball", "야구");
        System.out .println(map2.remove("people")); // 사람 출력
        /** size */
        System.out.println(map2.size());

        /** keySet */
        System.out.println(map2.keySet());
    }
}