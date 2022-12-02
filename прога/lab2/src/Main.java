import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p11 = new Wishiwashi("StASS", 10);
        Pokemon p12 = new Shedinja("Kolomiyka", 10);
        Pokemon p13 = new Floette("K18", 10);
        Pokemon p21 = new Nincada("Kirill", 10);
        Pokemon p22 = new Flabebe("MaxPri", 10);
        Pokemon p23 = new Florges("Serafim (5)", 10);
        b.addAlly(p11);
        b.addAlly(p12);
        b.addAlly(p13);
        b.addFoe(p21);
        b.addFoe(p22);
        b.addFoe(p23);
        b.go();
    }
}
