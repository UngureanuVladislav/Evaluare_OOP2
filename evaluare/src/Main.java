import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // b. Creare obiecte
        Produs produs = new Produs("Produs1", 10.0);
        Bicicleta bicicleta1 = new Bicicleta("Bicicleta1", 150.0, 5);
        MountainBike mountainBike1 = new MountainBike("MountainBike1", 200.0, 7, "Suspensie1");
        Scuter scuter1 = new Scuter("Scuter1", 300.0, 150.0);

        // Populare obiectul clasei părinte cu o listă de obiecte ale claselor copil
        List<Produs> listaProduse = new ArrayList<>();
        listaProduse.add(bicicleta1);
        listaProduse.add(mountainBike1);
        listaProduse.add(scuter1);

        produs.setNume("Produs2");
        produs.setPret(20.0);
        produs.setNume("Produs3");
        produs.setPret(30.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți numele produsului pentru filtrare:");
        String numeFiltru = scanner.nextLine();
        System.out.println();

        System.out.println("Introduceți prețul produsului pentru filtrare:");
        double pretFiltru = scanner.nextDouble();
        System.out.println();

        List<Produs> produseFiltrate = Produs.filtreazaDupaCriterii(listaProduse, numeFiltru, pretFiltru);
        System.out.println("Obiectele care satisfac criteriile introduse:");
        for (Produs p : produseFiltrate) {
            if (p instanceof Bicicleta) {
                Bicicleta bicicleta = (Bicicleta) p;
                System.out.println("Nume: " + bicicleta.getNume() + ", Pret: " + bicicleta.getPret() +
                        ", Numar Viteze: " + bicicleta.getNumarViteze());
                System.out.println();
            } else if (p instanceof MountainBike) {
                MountainBike mountainBike = (MountainBike) p;
                System.out.println("Nume: " + mountainBike.getNume() + ", Pret: " + mountainBike.getPret() +
                        ", Numar Viteze: " + mountainBike.getNumarViteze() +
                        ", Tip Suspensie: " + mountainBike.getTipSuspensie());
            } else if (p instanceof Scuter) {
                Scuter scuter = (Scuter) p;
                System.out.println("Nume: " + scuter.getNume() + ", Pret: " + scuter.getPret() +
                        ", Putere: " + scuter.getPutere());
                System.out.println();
            }
        }


        // d. Comparare obiectului clasei copil cu obiectele din lista
        Bicicleta bicicleta2 = new Bicicleta("Bicicleta2",  150.0, 6);
        System.out.println("Comparare cu obiectele din lista:");
        boolean coincidesWithAny = false;
        for (Produs p : listaProduse) {
            if (p.getNume().equals(bicicleta2.getNume()) && p.getPret() == bicicleta2.getPret()) {
                System.out.println("Nume: " + p.getNume() + ", Pret: " + p.getPret() + " coincide cu " + bicicleta2.getNume());
                coincidesWithAny = true;
            } else if (p.getPret() == bicicleta2.getPret()) {
                System.out.println("Nume: " + p.getNume() + ", Pret: " + p.getPret() + " coincide cu " + bicicleta2.getNume());
                coincidesWithAny = true;
            } else {
                System.out.println("Nume: " + p.getNume() + ", Pret: " + p.getPret() + " nu coincide cu " + bicicleta2.getNume());
            }
        }

        if (!coincidesWithAny) {
            System.out.println(bicicleta2.getNume() + " nu a fost găsit în lista de produse.");
        }

    }
}
