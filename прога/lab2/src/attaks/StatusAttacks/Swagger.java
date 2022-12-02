package attaks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect swag = new Effect().stat(Stat.ATTACK, +1);
        p.addEffect(swag);
        p.confuse();
    }
    @Override
    public String describe(){
        return "uses power of SWAG";
    }
}
