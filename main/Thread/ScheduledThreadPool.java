package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        System.out.println("첫번째 작입이 실행됩니다.");
        service.schedule(() -> System.out.println("두 번째 작업이 실행됩니다."), 5, TimeUnit.SECONDS);
        System.out.println("세 번째 작업이 실행됩니다.");

        service.shutdown();
    }
}
