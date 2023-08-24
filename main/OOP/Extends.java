package OOP;

class Animals {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animals {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

class HouseDog extends Dog {
    void sleet() {
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) {
        System.out.println(this.name+ " zzz in house for " + hour + " hours");
    }

}
public class Extends {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
