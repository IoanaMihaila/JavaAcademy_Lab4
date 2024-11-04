package Tema4;

//Legarea statica VS Legarea dinamica
class Vehicul {
    public void start() {
        System.out.println("Ne aflam in clasa Vehicul");
    }
}

class Masina extends Vehicul {
    public void start() {
        System.out.println("Ne aflam in clasa Masina");
    }
}

public class Ex7 {
    public static void porneste(Vehicul v) {
        System.out.println("Vehiculul porneste!");
    }

    public static void porneste(Masina m) {
        System.out.println("Masina porneste!");
    }

    public static void main(String[] args) {
        //Legare dinamica(la executie)
        Vehicul v = new Masina();
        v.start();//Ne aflam in clasa Masina!

        //Legare statica(la compilare)
        porneste(v);//Vehiculul porneste!
    }
}
