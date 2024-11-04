package Tema4;
class Pereche {
    private int a;
    private int b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

public class Ex1 {
    static void apelare(Pereche e, Pereche f) {
        e.set(80, 80);
        e = new Pereche();
        e.set(100, 100);
        f.set(50, 50);
    }

    static void apelare2(Pereche e, Pereche f) {
        e = f;
        e = new Pereche();
        e.set(20, 20);
    }

    static void apelare3(Pereche e, Pereche f) {
        f = e;
        e = f;
        e.set(40, 40);
        f.set(50,50);
    }

    public static void main(String argv[]) {
        Pereche x = new Pereche();
        x.set(11, 22);
        Pereche y = new Pereche();
        y.set(33, 44);

        System.out.println("X original: " + x + " - " + x.getA() + ", " + x.getB());
        System.out.println("Y original: " + y + " - " + y.getA() + ", " + y.getB());

        //apelare(x, y);//80,80    50,50
        //apelare2(x,y);//11,22    33,44
        apelare3(x,y);//50,50     33,44
        System.out.println(x.getA() + " " + x.getB());
        System.out.println(y.getA() + " " + y.getB());
    }
}
