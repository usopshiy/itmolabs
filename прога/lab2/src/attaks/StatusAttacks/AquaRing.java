package attaks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    private Boolean nused;
    public AquaRing(){
        super(Type.WATER,0,100);
        this.nused = true;
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2){
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect heal = new Effect().stat(Stat.HP, -(int)(p.getStat(Stat.HP)/16)).turns(-1);
        if(nused){
            p.addEffect(heal);
            nused = false;
        }
    }
    @Override
    public String describe(){
        return "Surrounds himself in veil of water";
    }
}
