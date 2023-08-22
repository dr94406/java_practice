package DataType;

public class Buffer {
    public static void main(String[] args) {

        // StringBuffer 사용
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("Jump to java");
        String result = sb.toString();
        System.out.println(result);

        // String 자료형 사용
        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);

        /**
         * 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다. 첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성하지만,
         * 두 번째 예제에서는 String 자료형에 + 연산이 있을 때마다 새로운 String 객체를 생성하므로 총 4개의 String 자료형 객체가 만들어진다.
         * 결론은, 문자열 추가 및 변경 작업이 많을 시 StringBuffer 사용하는 게 유리하다. (무거운 편에 속하기에)
         */

        //StringBuilder
        StringBuilder SB = new StringBuilder();
        SB.append("good");
        SB.append("morning");
        SB.append("go to house");
        String builder = SB.toString();
        System.out.println(builder);
        /**
         * StringBuffer는 멀티 스레드 환경에서 safety 하며 StringBuilder는 성능이 우수하다.
         * 따라서 동기화를 고려할 필요가 없을 시 Builder를 사용하는 것이 유리하다.
         */

        // insert (특정 위치에 원하는 문자열 삽입)
        StringBuffer bf = new StringBuffer();
        bf.append("let's go house");
        bf.insert(0, "every day ");
        System.out.println(bf.toString());

        // substring (String과 동일하게 동작)
        StringBuffer sbf = new StringBuffer();
        sbf.append("takeout a a");
        System.out.println(sbf.substring(0, 4));
    }
}
