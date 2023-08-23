package DataType;

public class Array {
    public static void main(String[] args) {
        int[] odd = {1, 3, 5, 7, 9};

        /** 배열 길이 지정 */
        String[] weeks = new String[7];
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";

        /** 인덱스로 배열값에 접근 */
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(week[3]);

        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        for(int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        for(String day : days) {
            System.out.println(day);
        }
    }
}
