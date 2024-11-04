package Tema4;

abstract class Figura {
    private String culoare;

    public Figura() {
        this.culoare = "Necunoscuta";
    }

    public Figura(String culoare) {
        this.culoare = culoare;
    }

    public abstract double calculeazaPerimetru();

    public void afiseazaDetalii() {
        System.out.println("Tip figura: " + this.getClass().getSimpleName() +
                ", Culoare: " + culoare +
                ", Perimetru: " + calculeazaPerimetru());
    }
}

class Cerc extends Figura {
    private int raza;

    public Cerc(int raza) {
        super();
        this.raza = raza;
    }

    public Cerc(String culoare, int raza) {
        super(culoare);
        this.raza = raza;
    }

    public double calculeazaPerimetru() {
        return 2 * Math.PI * raza;
    }
}

class Patrat extends Figura {
    private int latura;

    public Patrat(int latura) {
        super();
        this.latura = latura;
    }

    public Patrat(String culoare, int latura) {
        super(culoare);
        this.latura = latura;
    }

    @Override
    public double calculeazaPerimetru() {
        return 4 * latura;
    }
}

class Triunghi extends Figura {
    private int latura1;
    private int latura2;
    private int latura3;

    public Triunghi(String culoare, int latura1, int latura2, int latura3) {
        super(culoare);
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    @Override
    public double calculeazaPerimetru() {
        return latura1 + latura2 + latura3;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Figura cerc1 = new Cerc(5);
        Figura cerc2 = new Cerc("Albastru", 5);
        Figura patrat1 = new Patrat(10);
        Figura patrat2 = new Patrat("Verde", 10);
        Figura triunghi = new Triunghi("Rosu", 6, 8, 2);

        cerc1.afiseazaDetalii();
        cerc2.afiseazaDetalii();
        patrat1.afiseazaDetalii();
        patrat2.afiseazaDetalii();
        triunghi.afiseazaDetalii();
    }
}
