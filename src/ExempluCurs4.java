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
        //super(); si asa ar afisa tot 0
        valoareSubClasa = 200;
    }

    public int valoareImplicita() {
        return valoareSubClasa;
    }

    //daca am avea getValoare() suprascrisa din superclasa, ar afisa 200
    /*public int getValoare() {
        return valoareSubClasa;
    }*/
}

public class ExempluCurs4 {
    public static void main(String[] args) {
        SubClasa s = new SubClasa();
        System.out.println(s.getValoare());
        //Se va afisa 0, deoarece cand se apeleaza constructorul clasei SubClasa, se apeleaza implicit constructorul
        //superclasei inainte de setarea valorii 'valoareSubClasa=200' care ar fi trebuit folosita in metoda
        //'valoareImplicita()', astfel se va folosi valoarea implicita pentru int-uri si anume 0
    }
}
