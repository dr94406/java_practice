package Exception;

class FoolException extends RuntimeException{

}

public class Test{
    public void sayNick(String nick) throws FoolException{
            if ("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + "입니다.");
    }
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.sayNick("바보");
            test.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException 발생 ");
        }
    }
}
