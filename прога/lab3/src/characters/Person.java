package characters;
import enums.Smell;
import interfaces.Holding;
import objects.*;
import interfaces.Spyable;
import objects.Building;

import java.util.ArrayList;
import java.util.Objects;

public class Person extends LivingEntity implements Spyable {
    private String name;


    public Person(String name){
        this.name = name;
        this.state = new State("нейтральное");
        this.feel = new Feeling("никакое");
    }

    public void goTo(Building b){
        System.out.println(name + " приходит в " + b.getTitle());
        this.setPosition(b);
        b.addInside(this);
    }



    public void smellDog(Dog dog){
        if(dog.getSmell() == Smell.RATTY){
            System.out.println(this.getName() + " чувствует, что ее любимая " + dog.toString() + " пахнет крысами");
            this.setState(new State("Подозревает"));
        }
    }

    public void callBuro(Person p){
        System.out.println(this.getName() + " позвонила в сыскную контору и дала задание проследить за " + p.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public String getName(){return this.name;}

    @Override
    public void setFeel(Feeling feel) {
        if(feel.equals("Радость")){
            System.out.println("Это был радостный день для " + name);
        }
        if(this.feel.equals("Радость") && !feel.equals("Радость")){
            System.out.println("Радость " + name + " была недолгой");
        }
        super.setFeel(feel);
    }

    @Override
    public void setState(State state){
        if(state.equals("Подозревает")){
            System.out.println(this.getName() + " начал что-то подозревать");
        }
        super.setState(state);
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<String> beSpyed() {
        ArrayList<String> data = new ArrayList<String>();
        data.add("Точный адресс " + position.getTitle());
        data.add("Время, когда " + name + " его посещяет");
        return data;
    }
}
