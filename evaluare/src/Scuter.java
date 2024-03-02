public class Scuter extends Produs {
    // Atribut
    private double putere;

    // Constructor fără parametri
    Scuter() {
        super();
        this.putere = 0.0;
    }

    // Constructor cu parametri
    Scuter(String nume, double pret, double putere) {
        super(nume, pret);
        this.putere = putere;
    }

    // Metode
    public double getPutere() {
        return putere;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "Scuter{" +
                "putere=" + putere +
                '}';
    }
}
