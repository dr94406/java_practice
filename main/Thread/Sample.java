package Thread;

public class Sample extends Thread{
    int seq;

    public Sample(int seq) {
        this.seq = seq;
    }

    public void run() { // thread 상속 시 run method 구현해야한다.
        System.out.println(this.seq + "thread run....");

        try {
            Thread.sleep(1000); // 1초 대기
        }catch (Exception e) {

        }
        System.out.println(this.seq + "thread end...");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread t = new Sample(i);
            t.start();
        }
        System.out.println("main end.");
    }
}
