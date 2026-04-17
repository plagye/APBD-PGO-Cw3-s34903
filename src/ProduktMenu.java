public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "ProduktMenu{" +
                "kod='" + kod + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProduktMenu produktMenu)) return false;
        return Objects.equals(kod, produktMenu.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }

    public String getKod() {
        return kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }
}