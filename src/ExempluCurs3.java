class Numar {
    private int numar;
    public Numar() {
        this.numar = 10;
    }
    public Numar(int numar) {
        this.numar = numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }
    public void afisare() {
        System.out.println("Numar: " + this.numar);
    }
}

public class ExempluCurs3 {
    static void valoareaReferinta1(Numar numar) {
        numar.setNumar(50);
    }
    static void valoareReferinta2(Numar numar) {//referinta numar din metoda valoareReferinta2 primeste o copie a referintei originale catre obiectul Numar din main
        numar = new Numar(100);//creeaza un obiect Numar cu valoarea 100 si atribuie referinta acestui nou obiect variabilei numar din metoda valoareReferinta2
        //Aceasta reasignare nu afecteaza referinta oridinala din main, deoarece
        //numar din valoareReferinta2 este o copie a referintei iar modificarea sa
        //locala nu are impact asupra obiectului oroginal
    }
    public static void main(String argv[]) {
        //Numar numar = new Numar();
        //numar.afisare();//Numar: 10
        //valoareaReferinta1(numar);
        //numar.afisare(); //Numar: 50
        Numar numar = new Numar();
//        valoareReferinta2(numar);/
        numar.afisare(); //Numar: 10După apelul valoareReferinta2(numar);, referința originală numar din main continuă să pointeze la obiectul inițial, care are valoarea 10
    }
}
/*Apelul metodei:

Când apelăm valoareaReferinta1(numar), referința numar din metoda valoareaReferinta1 primește o copie a referinței originale care
pointează către obiectul Numar din main.
Modificarea obiectului:

Linia numar.setNumar(50); apelează metoda setNumar pe obiectul la care referința copiată din valoareaReferinta1 se leagă.
Aceasta modifică efectiv valoarea atributului numar al obiectului original, deoarece referința copiată indică același obiect din
memorie. Așadar, obiectul original are acum numar setat la 50.
Comportament de referință
În concluzie, atunci când modifici un obiect printr-o metodă, modificările se reflectă asupra obiectului original, deoarece
referințele din Java se leagă de obiectele din memorie, nu de variabilele care le conțin.

Iată o secvență de cod care ilustrează clar ce se întâmplă:

Inițializare:

Numar numar = new Numar(); (numărul este 10).
Primul apel:

valoareaReferinta1(numar); modifică obiectul original și acum numar devine 50.
Al doilea apel:

valoareReferinta2(numar); nu modifică obiectul original, ci creează un nou obiect Numar cu valoarea 100, dar referința la acest nou
 obiect nu este păstrată în main. După terminarea metodei, referința originală rămâne neschimbată la obiectul cu valoarea 50.
Recapitulare
valoareReferinta1: Modifică atributul obiectului original (de aceea se afișează 50).
valoareReferinta2: Creează un nou obiect, dar nu modifică referința originală din main (de aceea se afișează 50 și nu 100).*/
