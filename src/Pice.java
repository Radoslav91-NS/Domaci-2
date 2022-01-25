import java.time.LocalDate;

public class Pice extends Proizvod {
    private Ambalaza ambalaza;

    public Pice(String barKod, String naziv, double cena, Ambalaza ambalaza) {
        super(barKod, naziv, cena);
        this.ambalaza = ambalaza;
    }


    @Override
    public void poruci(int kolicina) {
        System.out.println("Vas racun je: " + (getCena() + cenaAmbalaze()) * kolicina + " dinara");
    }


    public double cenaAmbalaze() {
        double cenaAmbalaze = 0;
        switch (ambalaza) {
            case kartonska:
                cenaAmbalaze = getCena() * 10 / 100.0;
                break;
            case plasticna:
                cenaAmbalaze = getCena() * 20 / 100.0;
                break;
            case staklena:
                cenaAmbalaze = getCena() * 30 / 100.0;
                break;
            case limenka:
                cenaAmbalaze = getCena() * 30 / 100.0;
                break;
        }
        return cenaAmbalaze;
    }

}



/*Za pice metoda poruci ispisuje racun Vas racun je : (osnovna cena + cena ambalaze )* kolicina. Cena ambalaze se racuna na sledeci nacin :
o "kartonska" 10 % osnovne cene proizvoda ,
o "plasticna" 20% osnovne cene proizvoda,
o "staklena" 30% osnovne cene proizvoda,
o "limenka" 30% osnovne cene proizvoda.
- Dodati toString metodu za Proizvod koja ispisuje naziv */