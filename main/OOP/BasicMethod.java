package OOP;

public class BasicMethod {

    /** 입력값과 리턴값이 모두 있는 메서드 */
    int sum(int a, int b) { // a, b는 매개변수
        return a + b;
    }

    /** 입력값이 없는 메서드 */
    String say() {
        return "Hi";
    }

    /** 리턴값이 없는 메서드 */
    void Noreturn(int a, int b) {
        System.out.println(a+"와 " +b+"의 합은 " +(a+b)+ "입니다.");
    }

    /** 입력값과 리턴값이 모두 없는 메서드 */
    void Noinsert() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        BasicMethod method = new BasicMethod();
        int c = method.sum(a, b); // 인수

        System.out.println(c);
    }
}
