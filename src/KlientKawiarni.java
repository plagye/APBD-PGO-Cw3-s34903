import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;
    private static int liczbaKlientow=0;

    public static int  getLiczbaKlientow() {
        return KlientKawiarni.liczbaKlientow;
    }

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        liczbaKlientow++;
    }

    @Override
    public String toString() {
        return "KlientKawiarni{" +
                "idKlienta=" + idKlienta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof KlientKawiarni that)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    public void wypiszDane() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("ID Klienta: " + idKlienta);
    }
}

