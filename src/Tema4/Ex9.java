package Tema4;

class SuperClasa {
    public int valoareSuperClasa;

    public SuperClasa() {
        valoareSuperClasa = valoareImplicita();
    }

    public int valoareImplicita() {
        return 10;
    }

    public int getValoare() {
        return valoareSuperClasa;
    }
}

class SubClasa extends SuperClasa {
    private int valoareSubClasa;

    public SubClasa() {
        //constructorul superclasei e apelat implicit
        //valoareSuperClasa va fi initializata cu 0, deoarece constructorul nu a ajuns la initializarea
        //cu 200 a variabilei valoareSubClasa care ar fi returnata in metoda valoareImplicita()
        valoareSubClasa = 200;
    }

    public int valoareImplicita() {
        return valoareSubClasa;
    }
}

public class Ex9 {
    public static void main(String[] args) {
        SubClasa s = new SubClasa();
        System.out.println(s.getValoare());//0
    }
}
