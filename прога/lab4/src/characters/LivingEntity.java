package characters;
import objects.*;

public abstract class LivingEntity {
        Place position;
        State state;
        Feeling feel;
        public void setPosition(Place place){
            this.position = place;
        }
        public void setState(State state){
            this.state = state;
        }
        public State getState(){return state;}

    public void setFeel(Feeling feel) {
        this.feel = feel;
    }

    public Feeling getFeel() {
        return feel;
    }
}
