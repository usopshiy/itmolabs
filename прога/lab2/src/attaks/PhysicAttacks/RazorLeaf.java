package attaks.PhysicAttacks;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf(){
        super(Type.GRASS, 55, 95);
    }
    @Override
    public String describe(){
        return "attacks with Razor Leaf";
    }
}
