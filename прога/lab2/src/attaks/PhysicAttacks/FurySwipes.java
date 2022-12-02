package attaks.PhysicAttacks;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Type.*;

public class FurySwipes extends PhysicalMove {

    public FurySwipes(){
        super(Type.NORMAL, 18, 80, 0, 2 + (int)(Math.random()*4));
    }

    @Override
    public String describe(){
        return "Attacks with Fury Swipes";
    }
}
