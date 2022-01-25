import java.util.ArrayList;

public class Andjela {
    /*
    korpa ne mora extend proizvod . povezivanje se radi preko araylist proizvod. korpa sadrzi proizvod
    kako je kupac u korpi, tako su i  proizvodi tamo.

     */

    private String kupac;
    private ArrayList<Proizvod> proizvodi;
    private ArrayList<Integer> kolicine;

    public Andjela(String kupac) {
        this.kupac = kupac;
        this.proizvodi = new ArrayList<>();
        this.kolicine = new ArrayList<>();
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public ArrayList<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void addProizvod(Proizvod proizvod) {
        if (!this.proizvodi.contains(proizvod)) { //ako niz proizvoda ne sadrzi neki proizvod onda
            this.proizvodi.add(proizvod);
            this.kolicine.add(1);
        } else {
            int indexOfProduct = this.proizvodi.indexOf(proizvod); //nalazimo index nekog elementa
            int newValue = this.kolicine.get(indexOfProduct) + 1; //nova vrednost
            this.kolicine.set(indexOfProduct, newValue);
        }

        this.proizvodi.add(proizvod);
    }

    public void ispisiRacunnn () {
        int ukupno = 0;
        for (int i = 0; i < this.proizvodi.size(); i++) {
            System.out.println(this.proizvodi.get(i).getNaziv() + " X " + this.kolicine.get(i) + " " + this.kolicine.get(i) * this.proizvodi.get(i).getCena()); // brate...

        }
    }

}

/* add - dodaje u listu
get - uzima iz liste
set - setuje odredjenu vrednost
contain - proverava da li sadrzi neku vrednost
// isto kao ovo proizvodi[i]--- this.proizvodu.get(i) je jedan proizvod linija 42
Andjela nija pravila klasu kupac, sve je radjeno direktno iz klase Andjela (Korpa)
Prepisi njene metode ispisi racun i add proizvod
 */