package attaks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL,0,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        return true;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect confide = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(confide);
    }
    @Override
    public String describe(){
        return "uses confide";
    }
}
