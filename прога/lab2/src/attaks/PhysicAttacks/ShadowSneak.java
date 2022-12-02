package attaks.PhysicAttacks;

import ru.ifmo.se.pokemon.*;

public class ShadowSneak extends PhysicalMove {

    public ShadowSneak(){
        super(Type.GHOST, 40, 100, 1, 1);
    }

    @Override
    public String describe(){
        return "uses Shadow Sneak";
    }
}
