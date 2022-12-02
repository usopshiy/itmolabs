package attaks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {

    public SandAttack(){
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect blinded = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(blinded);
    }
    @Override
    protected String describe(){
        return "uses Sand Attack!";
    }
}
