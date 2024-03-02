public class Bicicleta extends Produs {
    // Atribute
    private int numarViteze;

    // Constructor fără parametri
    Bicicleta() {
        super();
        this.numarViteze = 0;
    }

    // Constructor cu parametri
    Bicicleta(String nume, double pret, int numarViteze) {
        super(nume, pret);
        this.numarViteze = numarViteze;
    }

    // Metode
    public int getNumarViteze() {
        return numarViteze;
    }

    public void setNumarViteze(int numarViteze) {
        this.numarViteze = numarViteze;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "Bicicleta{" +
                "numarViteze=" + numarViteze +
                '}';
    }
}
