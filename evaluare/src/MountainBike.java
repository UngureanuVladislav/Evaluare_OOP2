public class MountainBike extends Bicicleta {
    // Atribut
    private String tipSuspensie;

    // Constructor fără parametri
    MountainBike() {
        super();
        this.tipSuspensie = "Standard";
    }

    // Constructor cu parametri
    MountainBike(String nume, double pret, int numarViteze, String tipSuspensie) {
        super(nume, pret, numarViteze);
        this.tipSuspensie = tipSuspensie;
    }

    // Metode
    public String getTipSuspensie() {
        return tipSuspensie;
    }

    public void setTipSuspensie(String tipSuspensie) {
        this.tipSuspensie = tipSuspensie;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "MountainBike{" +
                "tipSuspensie='" + tipSuspensie + '\'' +
                '}';
    }
}
