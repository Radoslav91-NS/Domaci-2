public class Tehnika extends Proizvod {

    private int garancija;
    private double tezina;

    public Tehnika(String barKod, String naziv, double cena, int garancija, double tezina) {
        super(barKod, naziv, cena);

        this.garancija = garancija;
        this.tezina = tezina;
    }


    @Override
    public void poruci(int kolicina) {
        if (tezina > 30) {
            System.out.println("Dostava do vrata!");

        }
        System.out.println("Vas racun je " + getCena() * kolicina + " dinara.");
    }

}
//Za Tehniku metoda poruci ,ako je tezina veca od 30, ispisuje poruku “Dostava do vrata” a
// zatim ispisuje “Vas racun je : ...racuna racun kao cena * kolicina