package CodeUp;

import java.util.Scanner;
/** 1024  [기초-입출력] 단어 1개 입력받아 나누어 출력하기 **/
public class Main_1024 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        char[] ch = temp.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.printf("'%c'\n", ch[i]);
        }
    }
}
