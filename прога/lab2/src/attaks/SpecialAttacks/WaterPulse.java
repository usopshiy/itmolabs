package attaks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {


    public WaterPulse(){
        super(Type.WATER, 60, 100);
    }
    @Override
    public String describe() { return "uses Water Pulse"; }
    @Override
    protected void applyOppEffects(Pokemon p){
       if(Math.random() < 0.2){
           p.confuse();
       }
    }
}
