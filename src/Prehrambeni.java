import java.time.LocalDate;

public class Prehrambeni extends Proizvod {

    private LocalDate datumIsteka;


    public Prehrambeni(String barKod, String naziv, double cena, LocalDate datumIsteka) {
        super(barKod, naziv, cena);
        this.datumIsteka = datumIsteka;
    }


    @Override
    public void poruci(int kolicina) {
        if (datumIsteka.isAfter(LocalDate.now())) {
            System.out.println("Datum istekao, mleko prokislo a meso se ubudjavilo!!!");
        } else {
            System.out.println("Vas racun je " + getCena() * kolicina + " dinara.");
        }
    }

}

//Za Prehrambeni metoda poruci proverava da li je prosao datum isteka ,
// ako jeste ispisuje Datum istekao!!! U suprotnom ispisuje Vas racun je: racuna ... cena * kolicina