package OOP;

class Drink {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Coffee extends Drink {
    void shake() {
        System.out.println(this.name+ " shake");
    }
}

class Starbucks extends  Coffee {
    Starbucks(String name) {
        this.setName(name);
    }
    void shake() {
        System.out.println(this.name + " milk coffee ");
    }

    void sleep(int sugar) {
        System.out.println(this.name + " milk coffee and ~ " + sugar + " sugar!!!!");
    }
}

public class constructor {
    public static void main(String[] args) {
        Starbucks shop = new Starbucks("coffee");
        System.out.println(shop.name);
    }

}
