package Accessmodifier.test;

import Accessmodifier.protectedTest;

public class protectedCall extends protectedTest {
    public static void main(String[] args) {
        protectedCall protectedCall = new protectedCall();
        System.out.println(protectedCall.name); // 상속한 클래스의 protected 접근.

        protectedTest protectedTest = new protectedTest();
        System.out.println(protectedTest.info); // public 접근.
    }
}
