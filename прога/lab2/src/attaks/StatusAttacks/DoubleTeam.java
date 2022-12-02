package attaks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{

    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        return true;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect evase = new Effect().stat(Stat.EVASION, +2);
        p.addEffect(evase);
    }
    @Override
    protected String describe(){
        return "uses Double Team";
    }
}
