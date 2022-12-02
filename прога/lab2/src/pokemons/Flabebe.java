package pokemons;

import attaks.StatusAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Flabebe extends Pokemon {

    public Flabebe(String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setStats(44, 38,39,61,79,42);
        setMove(new Confide(), new Swagger());
    }
}
