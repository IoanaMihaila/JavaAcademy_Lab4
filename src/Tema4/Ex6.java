package Tema4;

class Aaa {
    public void doSomething() {
        System.out.println("Hello from A!");
    }
}

class Bbb extends Aaa {
    public void doSomething() {
        System.out.println("Hello from B!");
    }
}


public class Ex6 {
    public static void oneMethod(Aaa a) { //legare dinamica
        a.doSomething();
    }

    public static void main(String[] args) {
        Bbb obj = new Bbb();
        obj.doSomething();//Hello from B!
        oneMethod(obj); //compileaza? da, nu? de ce?
        /*Compileaza deoarece polimorfismul permite ca o referinta de tipul clasei parinte sa refere la un obiect al unei clase derivate
        Parametrul metodei oneMethod este de tipul Aaa, dar poti transmte un obiect de tip Bbb deoarece Bbb este o subclasa a lui Aaa
        Desi oneMethod primeste un obiect de tip Aaa, la executie va apela implementarea suprascrisa in Bbb
        ->afisare: Hello from B!
         */
    }
}
