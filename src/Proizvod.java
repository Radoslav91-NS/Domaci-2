public abstract class Proizvod {

    private String barKod;
    private String naziv;
    private double cena;


    public Proizvod(String barKod, String naziv, double cena) {
        this.barKod = barKod;
        this.cena = cena;
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getBarKod() {
        return barKod;
    }

    public double setCena(double cena) {
        return cena = cena;
    }

    public String setNaziv(String naziv) {
        return naziv = naziv;
    }

    public String setbarKod(String barKod) {
        return barKod = barKod;
    }


    public void setPopust(double popust) {

        setCena(getCena() - (getCena() * popust / 100.00));

    }

    public abstract void poruci(int kolicina);

    @Override
    public String toString() { // ovo pisemo da prebacimo deo koda u string. Ako ne napisemo, dobijamo @378sdds89 ispis
        return "Proizvod: " + naziv + ", cena: " + cena;

    }


}




