package pokemons;

import attaks.PhysicAttacks.*;

public class Shedinja extends Nincada{
    public Shedinja(String name, int level) {
        super(name, level);
        setStats(1,90,45,30,30,40);
        addMove(new ShadowSneak());
    }
}
