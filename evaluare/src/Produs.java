import java.util.ArrayList;
import java.util.List;

public class Produs {
    // Atribute
    private String nume;
    private double pret;

    // Constructori
    public Produs() {
        this.nume = "Produs";
        this.pret = 0.0;
    }

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    // Metode de acces
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    // Metoda de filtrare pentru numele produsului
    public static List<Produs> filtreazaDupaNume(List<? extends Produs> lista, String nume) {
        List<Produs> rezultat = new ArrayList<>();
        for (Produs produs : lista) {
            if (produs.getNume().equals(nume)) {
                rezultat.add(produs);
            }
        }
        return rezultat;
    }

    // Metoda de filtrare pentru nume și preț
    public static List<Produs> filtreazaDupaCriterii(List<? extends Produs> lista, String nume, double pret) {
        List<Produs> rezultat = new ArrayList<>();
        for (Produs produs : lista) {
            if (produs.getNume().equals(nume) && produs.getPret() == pret) {
                rezultat.add(produs);
            }
        }
        return rezultat;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
