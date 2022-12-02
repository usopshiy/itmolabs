package attaks.PhysicAttacks;

import ru.ifmo.se.pokemon.*;

public class FeintAttack extends PhysicalMove {

    public FeintAttack(){
        super(Type.DARK, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        return true;
    }
    @Override
    public String describe(){
        return "uses Feint Attack";
    }

}
