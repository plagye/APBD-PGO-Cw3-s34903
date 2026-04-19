# Prosta aplikacja konsolowa w Javie modelująca obsługę zamówień w kameralnej kawiarni.

`---`

## Model
 
Trzy klasy domenowe plus `Main`:
 
- **`ProduktMenu`** — pozycja z menu (kod, nazwa, cena, kategoria). `equals` po kodzie.
- **`KlientKawiarni`** — klient (id, imię, nazwisko, email). `equals` po emailu.
- **`Zamowienie`** — zamówienie klienta z listą produktów (`ArrayList<ProduktMenu>`), numerem nadawanym automatycznie przez statyczny licznik oraz statusem płatności.
## Co pokazuje
 
- pola i metody statyczne (`liczbaProduktow`, `liczbaKlientow`, `kolejnyNumer`)
- `ArrayList` jako kolekcja produktów w zamówieniu
- nadpisane `toString()`, `equals()` i `hashCode()`
- akcje biznesowe zamiast surowych setterów (`oznaczJakoOplacone()`)
