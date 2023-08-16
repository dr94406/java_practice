package Exception;

public class Accident {
    public static void main(String[] args) {
        try {

            int Score = Integer.parseInt(args[0]);

            if (Score > 100) {
                throw new NumberFormatException("점수 확인 바람");
                // 예외 인위 발생
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("=============================");
            System.out.println(e.getMessage() + "예외 추가 ");
        }
    }
}
