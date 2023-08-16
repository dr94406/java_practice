package Exception;

public class ThrowsEx {
    public void call_A() throws Exception {
        call_B();
    }
    private  void call_B() throws  Exception {
        call_C();
    }
    private void call_C() throws Exception {
        System.out.println(1 / 0);
    }

    public static void main(String[] args) throws Exception {
        ThrowsEx test = new ThrowsEx();
        test.call_A();

    }
}
