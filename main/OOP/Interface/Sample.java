package OOP.Interface;

/** 추상 클래스로 변경 */
abstract class Predator extends Animal{
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
        }
    }

interface Barkable {
    void bark();
}

/** 인터페이스는 인터페이스를 상속 , 일반 클래스는 단일 상속만을 허용*/
interface BarkablePredator extends Barkable {

}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable {

    public String getFood() {
        return "apple";
    }
    public void bark() {
        System.out.println("어흥 !");
    }
}

class Lion implements BarkablePredator{
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁 !");
    }
}

/** 동물 클래스와 상관없는 독립적인 클래스로 분리 */
class ZooKeeper {
    void barkAnimal(Barkable animal) {
    animal.bark();}
}
class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Sample {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}

/** 인터페이스는 메서드를 반드시 구현해야 한다는 강제성을 가진다는 것을 기억하자 */

