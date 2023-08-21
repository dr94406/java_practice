package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamPractice {

    // 스트림 객체 생성
     List<String> list = Arrays.asList("a","b","c");
    Stream<String> stream = list.stream();

    //스트림 생성 - 배열
    String[] array = new String[]{"a","b","c"};
    Stream<String> stream1 = Arrays.stream(array);
    Stream<String> stream2 = Arrays.stream(array, 1, 3);

    //스트림 생성 - Generator
    public static <T> Stream<T> generate(Supplier<T> s) {
        return generate(s);
    }

    //스트림 생성 - Iterator
    Stream<Integer> IteratorStream = Stream.iterate(100, n -> n + 10).limit(5);

    //스트림 생성 - Empty 스트림
    Stream<String> EmptyStream = Stream.empty();
}
