package OOP;

class Siga {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Mix extends Siga {
    void flush() {
        System.out.println(this.name + " COOOL");
    }
}
class LiL extends Mix {
    LiL(String name) {
        this.setName(name);
    }
    LiL(int type) {
        if(type == 1) {
            this.setName("mixx");
        }else if(type == 2) {
            this.setName("Kuba");
        }
    }

    void drow() {
        System.out.println(this.name + " drow ! ");
    }

    void drow(int stick) {
        System.out.println(this.name + " stick drow " + stick + " drow ");
    }
}

public class Overloading {
    public static void main(String[] args) {
        LiL lil = new LiL("stick");
        LiL mixx = new LiL(1);
        System.out.println(lil.name);
        System.out.println(mixx.name);
    }
}
