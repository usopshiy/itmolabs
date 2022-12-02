package attaks.PhysicAttacks;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove {
    public Scratch(){
        super(Type.NORMAL,40,100);
    }
    @Override
    public String describe(){
        return "Scratches his opponent";
    }
}
