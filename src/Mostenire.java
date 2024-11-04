class Persoana{
    private String nume;
    private String prenume;

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
}

class Elev extends Persoana{
    private int clasa;

    public Elev(String nume, String prenume, int clasa) {
        super(nume, prenume);
        this.clasa = clasa;
    }
}


public class Mostenire {
}
