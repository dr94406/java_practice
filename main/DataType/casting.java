package DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class casting {
	public static void main(String[] args) {
		int n = 123;
		/** 정수 -> 문자열 변환 */
		String num1 = String.valueOf(n);
		String num2 = Integer.toString(n);
		System.out.println("num 1: " + num1);
		System.out.println("num 2: " + num2);

		/** 문자열 -> 실수 변환 */
		String num = "123.456";
		double d = Double.parseDouble(num);
		System.out.println(d);

		/** 정수 -> 실수 (캐스팅 필요 X) */
		int n1 = 123;
		double d1 = n1;
		System.out.println(d1);

		/** 실수 -> 정수 (캐스팅 필요) */
		double d2 = 123.456;
		int n2  = (int) d2;
		System.out.println(n2); // 소수점 생략되어 출력.

		/** 실수 형태 문자 -> 정수 */
		String temp = "123.456";
		int tempToNum = Integer.parseInt(temp); // NPE 발생.
		double tempToNum2 = Double.parseDouble(temp); // 실수 형태로 변경 할 것.

		/** final */
		final int k = 123;
//		k = 456;  final 이므로 변경 불가.

		/** final로 선언한 리스트 */
		final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
//		a = new ArrayList<>(Arrays.asList("c","d"));  final 이므로 동일하게 변경 불가.

		/** Unmodifiable List
		 *	 값을 더하거나 뺄 수 없게 하려면 List.of를 사용하여 수정할 수 없는 리스트를 만들어야 한다.
		 **/
		final List<String> ab = List.of("a", "b");
		a.add("c");  // UnsupportedOperationException 발생


	}

}
