import java.util.ArrayList;
import java.util.List;

class Curs {

}

class Student {
    private Curs curs;//asociere-foloseste
    private Carte carte;//agregare-are

    public Student(Carte carte, Curs curs) {
        this.carte = carte;
        this.curs = curs;
    }
}

class Carte {
    private List<Capitol> capitole; //compozitie-detine

    public Carte(List<Capitol> capitole) {
        this.capitole = new ArrayList<>();
    }
}

class Capitol {

}

public class Main {
    public static void main(String[] args) {

    }
}
