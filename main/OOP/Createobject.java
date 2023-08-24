package OOP;

class Animal {
    String name = "c a t 야 옹 ";


    public void changeAnimalName(String name) {
        this.name = name;
    }
}
public class Createobject {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.name);
        animal.changeAnimalName("d o g 멍 멍");
        System.out.println(animal.name);

        OOP.Animal cat = new Animal();
        cat.changeAnimalName("다 시 고 양 이! ");
        System.out.println(cat.name);

        /** 결과를 보면 name 객체 변수는 공유되지 않는다는 것을 확인할 수 있다.
         *  즉, 객체 변수의 값은 독립적으로 유지된다.
         */
    }
}
