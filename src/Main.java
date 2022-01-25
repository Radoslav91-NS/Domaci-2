import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Kupovina(korpaKorisnika(), listaProizvoda());

    }

    private static Korpa korpaKorisnika() {
        Scanner s = new Scanner(System.in); // skener mora biti ovde, ne radi ako je u main metodi

        System.out.println("Unesite vase ime: ");
        String ime = s.nextLine();

        System.out.println("Unesite vase prezime: ");
        String prezime = s.nextLine();

        return new Korpa(new Kupac(ime, prezime)); // vraca korpu u main (vraca ime i prezime korisnika)

    }

    private static LinkedList<Proizvod> listaProizvoda() {

        Proizvod p1 = new Prehrambeni("475sdi7", "mleko", 100, LocalDate.of(2021, 12, 30));
        Proizvod p2 = new Tehnika("345kh3", "sporet", 35000, 5, 40);
        Proizvod p3 = new AlkoholnaPica(10, "654k33", "pivo", 120, Ambalaza.staklena);
        Proizvod p4 = new Pice("774gg", "sok breskva", 200, Ambalaza.kartonska);

        LinkedList<Proizvod> proizvodi = new LinkedList<>();
        proizvodi.add(p1);
        proizvodi.add(p2);
        proizvodi.add(p3);
        proizvodi.add(p4);

        return proizvodi;
    }

    //        for (Proizvod p : proizvodi) {
//            System.out.println(p);  // stampa sve proizvode
//            if (p.getCena() >= 200) { // ne racuna popust - zasto??
//                p.setPopust(15);
//                System.out.println(p);
//            }
//            System.out.println("_________________________________________________________");
//
//        }
//
//        for (Proizvod p : proizvodi) {
//            p.poruci(1);
//        }
    private static void Kupovina(Korpa korpa, LinkedList<Proizvod> proizvodi) {
        Scanner sc = new Scanner(System.in); // novi skener, jer je nova private metoda
        String unos = " "; //inicijalizacija stringa

        while (!unos.equals("zavrsi kupovinu")) { //ako unos nije zavrsi kupovinu prgram se nastavlja
            System.out.println("Unesite bar kod proizvoda koji zelite da dodate u korpu: ");
            System.out.println("Da zavrsite kupovinu napisite 'zavrsi kupovinu'. ");
            Boolean postojeci = false; // true/false uslov

            unos = sc.nextLine();  //davanje vrednosti stringu (unos korisnika)

            for (Proizvod p : proizvodi) {
                if (p.getBarKod().equals(unos)) {
                    korpa.addProizvod(p);
                    postojeci = true;
                    break;
                }
            }
            if (postojeci == true) {
                System.out.println("Proizvod dodat u korpu.");
            } else {
                System.out.println("Nepostojeci bar kod."); // nzm kako da ovo izbacim - ispisuje se nakon izvrsavanja ispisiRacun :/
            }

        }
        korpa.ispisiRacun();

    }

}

