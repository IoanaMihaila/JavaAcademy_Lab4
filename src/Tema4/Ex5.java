package Tema4;

class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public void afisareDetalii() {
        System.out.println("Nume: " + nume);
        System.out.println("CNP: " + cnp);
    }

    public void actualizeazaInformatii(String numeNou) {
        this.nume = numeNou;
        System.out.println("Numele a fost actualizat la: " + nume);
    }

    public void actualizeazaInformatii(String numeNou, String cnpNou) {
        this.nume = numeNou;
        this.cnp = cnpNou;
        System.out.println("Numele și CNP-ul au fost actualizate la: " + nume + ", " + cnp);
    }

    public void actualizeazaInformatii(String prefix, String numeNou, String cnpNou) {
        this.nume = prefix + " " + numeNou;
        this.cnp = cnpNou;
        System.out.println("Detaliile au fost actualizate la: " + nume + ", " + cnp);
    }
}

class Student extends Persoana {
    private int nrCursuri;
    private String facultate;

    public Student(String nume, String cnp, int nrCursuri, String facultate) {
        super(nume, cnp);
        this.nrCursuri = nrCursuri;
        this.facultate = facultate;
    }

    @Override //suprascriere(polimorfism dinamic)
    public void afisareDetalii() {
        super.afisareDetalii();
        System.out.println("Facultate: " + facultate);
        System.out.println("Numar cursuri: " + nrCursuri);
    }

}

public class Ex5 {
    public static void main(String[] args) {
        Persoana p = new Student("Onea Mihai", "5031211206318", 8, "Drept UVT");
        p.afisareDetalii();

        System.out.println();

        p.actualizeazaInformatii("Popescu Mihai"); // Actualizare doar nume
        p.afisareDetalii();

        System.out.println();

        p.actualizeazaInformatii("Pop Alin", "5041211206318"); // Actualizare nume și CNP
        p.afisareDetalii();

        System.out.println();

        p.actualizeazaInformatii("Dr.", "Popescu", "6041211206318"); // Actualizare cu prefix și nume
        p.afisareDetalii();
    }
}
