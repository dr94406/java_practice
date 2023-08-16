package Exception;

public class ExceptionTry {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("arr[" + i + "] : " + arr[i]);
            }
        } catch (Exception e) {
            System.out.println("예외 발생 ");
        }finally {
            System.out.println(" = ==== == == = == =");
            System.out.println("예외 발생과 상관없이 수행함.");
        }
    }
}
