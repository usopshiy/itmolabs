package characters;

import interfaces.Holdable;
import interfaces.Holding;
import objects.Place;
import objects.State;

public class Rat extends LivingEntity implements Holdable {
    public Rat() {
    }

    @Override
    public String toString() {
        return "Крыса";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public void giveTo(Holding h) {
        h.pickUp(this);
    }
    public void run(){
        System.out.println("Крыса пытается убежать");
        this.state = new State("Убегает");
    }
    public void hide(Place place){
        System.out.println("Крыса прячется " + place.toString());
        this.position = place;
        this.state = new State("Прячется");
    }
}
