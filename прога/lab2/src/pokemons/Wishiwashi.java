package pokemons;

import attaks.PhysicAttacks.*;
import attaks.SpecialAttacks.*;
import attaks.StatusAttacks.*;
import ru.ifmo.se.pokemon.*;

public class Wishiwashi extends Pokemon {

    public Wishiwashi(String name, int level) {
        super(name, level);
        addType(Type.WATER);
        setStats(45, 20, 20, 25, 25, 40);
        setMove(new WaterPulse(), new FeintAttack(), new AquaRing(),new DoubleTeam());

    }

}
