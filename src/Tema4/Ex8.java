package Tema4;

class Farmacie {
    private Medicament[] medicamente;
    private int count;

    public Farmacie(int capacitate) {
        medicamente = new Medicament[capacitate];
        count = 0;
    }

    public void addMedicament(Medicament m) {
        for (int i = 0; i < count; i++) {
            if (medicamente[i].getID().equals(m.getID())) {
                medicamente[i].setCantitate(medicamente[i].getCantitate() + m.getCantitate());
                return;
            }
        }
        if (count < medicamente.length) {
            medicamente[count++] = m;
        } else {
            System.out.println("Capacitatea farmaciei a fost depasita!");
        }
    }

    public void afisareMedicamente() {
        for (int i = 0; i < medicamente.length; i++) {
            Medicament m = medicamente[i];
            if(m!=null) {
                System.out.println("Nume: " + m.getNume() + ", ID: " + m.getID() + ", Cantitate: " + m.getCantitate() + ", Pret: " + m.getPret());
            }
        }
    }
    public double getMaximPret(){
        double maximPret=medicamente[0].getPret();
        for(int i=0;i<medicamente.length;i++){
            Medicament m = medicamente[i];
            if(m!=null){
                double pret=m.getPret();
                if(pret>maximPret) {
                    maximPret = pret;
                }
            }
        }
        return maximPret;
    }
}

class Medicament {
    private String nume;
    private String ID;
    private int cantitate;
    private double pretDeBaza;

    public Medicament(String nume, String ID, int cantitate, double pretDeBaza) {
        this.nume = nume;
        this.ID = ID;
        this.cantitate = cantitate;
        this.pretDeBaza = pretDeBaza;
    }
    public void setPretDeBaza(double pretDeBaza) {
        this.pretDeBaza = pretDeBaza;
    }
    public double getPretDeBaza() {
        return pretDeBaza;
    }

    public double getPret() {
        return 0;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID() {
        return ID;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
    public int getCantitate() {
        return cantitate;
    }
}

class Compensat extends Medicament {
    private double pret;
    private double coeficient;

    public Compensat(String nume, String ID, int cantitate, double pretDeBaza, double coeficient) {
        super(nume, ID, cantitate, pretDeBaza);
        this.coeficient = coeficient;
    }

    public double getPret() {
        pret = super.getPretDeBaza() * coeficient;
        return pret;
    }
}

class Necompensat extends Medicament {
    private double pret;

    public Necompensat(String nume, String ID, int cantitate, double pretDeBaza) {
        super(nume, ID, cantitate, pretDeBaza);
    }

    public double getPret() {
        pret = super.getPretDeBaza();
        return pret;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie(10);
        farmacie.addMedicament(new Compensat("Paracetamol", "P123",10, 5.0,0.5));
        farmacie.addMedicament(new Compensat("Ibuprofen", "I456", 20, 7.0, 0.6));
        farmacie.addMedicament(new Necompensat("Aspirina", "A789", 15, 4.0));

        farmacie.afisareMedicamente();
        System.out.println("Pretul maxim: "+farmacie.getMaximPret());
    }
}
