package attaks.PhysicAttacks;

import ru.ifmo.se.pokemon.*;

public class PetalBlizzard extends PhysicalMove {
    public PetalBlizzard(){
        super(Type.GRASS, 90,100);
    }
    @Override
    public String describe(){
        return "uses Petal Blizzard";
    }
}
