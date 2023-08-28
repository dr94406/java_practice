package Functional;

@FunctionalInterface
interface Calculator {
    // 메서드 1개만 허용.
    int sum(int a, int b);
}

class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = (a,b) -> a + b; // 람다 적용
//        Calculator mc = Integer::sum;  // 축약
        int result = mc.sum(3, 4);
        System.out.println(result); // 7 출력
        
    }
}
