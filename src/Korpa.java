import java.util.HashMap;

public class Korpa {

    private Kupac kupac;
    private HashMap<Proizvod, Integer> proizvodKolicina;

    public Korpa(Kupac kupac) {  // konstruktor
        this.kupac = kupac;
        proizvodKolicina = new HashMap<>();

    }


    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public HashMap<Proizvod, Integer> getProizvodKolicina() {
        return proizvodKolicina;
    }

    public void addProizvod(Proizvod proizvod) {
        if (proizvodKolicina.containsKey(proizvod)) {
            proizvodKolicina.put(proizvod, proizvodKolicina.get(proizvod) + 1);
        } else {
            proizvodKolicina.put(proizvod, 1);
        }
    }


    public void ispisiRacun() {//naziv -- kolicina -- cena*kolicina //

        double racun = 0;
        for (Proizvod p : proizvodKolicina.keySet()) {

            String s = "";
            s = s + p.getNaziv() + " X " + proizvodKolicina.get(p) + " " + p.getCena() * proizvodKolicina.get(p);
            System.out.println(s);
            double ukupno = p.getCena() * this.proizvodKolicina.get(p);

            racun = racun + ukupno;
            System.out.println("Za uplatu: " + racun);


        }

    }

}


/* Korpa treba da sadrzi :
1. kupca (kupac moze biti u vidu Stringa samo ime I prezime “Pera Peric” ili mozete napraviti jos jednu klasu zasebno za kupca),
2. proizvode koji su u korpi (bez dupliranih proizvoda)
3. kolicine za svaki proizvod
Napomena: najlakse je koristiti mapu za parove proizvod – kolicina ali mozete iskoristit I ArrayList pa imati odvojene nizove za proizvode i za kolicine.
Konstruktor klase Korpa:
Prima samo kupca.
Get & set :
Postoji geter I seter za kupca.
Postoji samo geter za proizvode.(set metoda ne)
Ostale metode:
addProivod – prima proizvod I dodaje u listu proizvoda iz korpe (update kolicina ako vec postoji takav proizvod u korpi)
ispisiRacun – ispisuje konacni racun u sledecem formatu: naziv --  kolicina -- cena*kolicina
Ako su vam potrebne mozete praviti pomocne privatne metode. */