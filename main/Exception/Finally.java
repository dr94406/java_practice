package Exception;

public class Finally {
    public void shouldBeRun() {
        System.out.println("ok good ");
    }

    public static void main(String[] args) {
        Finally finallys = new Finally();
        int c;
        try {
            c = 4 / 0;
            finallys.shouldBeRun();
        }catch (ArithmeticException e) {
            c = -1;
        } finally { // 예외와 상관없이 수행.
            finallys.shouldBeRun();
        }
    }
}
