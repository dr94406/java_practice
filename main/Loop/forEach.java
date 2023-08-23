package Loop;

public class forEach {
    public static void main(String[] args) {
        String[] numbers = {"one","two","three"};
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            for(String str : numbers) {
                System.out.println(str);
            }
    }
}
