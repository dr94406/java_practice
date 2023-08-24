package OOP;


class Updater {
        void update(Counter counter) {
            counter.count++;
        }
    }
    class Counter {
        int count = 0; // 객체 변수
    }

public class Objectvariable {
    public static void main(String[] args) {
        Counter  myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
