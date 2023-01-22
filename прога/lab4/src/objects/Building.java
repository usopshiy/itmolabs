package objects;

import characters.*;
import enums.*;

import java.util.ArrayList;
import java.util.Objects;

public class Building extends Place {
    private String title;
    private ArrayList<Person> people;
    private Smell smell;
    private ArrayList<LivingEntity> inside;
    Door door;

    public Building(String title) {
        super(title);
        people = new ArrayList<Person>();
        smell = Smell.NOSMELL;
        inside = new ArrayList<LivingEntity>();

    }

    public void addInside(LivingEntity l) {
        inside.add(l);
    }

    public void removeInside(LivingEntity l) {
        inside.remove(l);
    }

    public void setSmell(Smell s) {
        smell = s;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setPeopleState(State state) {
        for (Person person : people) {
            person.setState(state);
        }
    }

    public void setPeopleFeel(Feeling feel) {
        for (Person person : people) {
            person.setFeel(feel);
        }
    }

    public Smell getSmell() {
        return smell;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(title, building.title) && smell == building.smell && Objects.equals(inside, building.inside);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, people, smell, inside);
    }

    public class Door {
        Boolean closed = true;

        public void opendatdoor() {
            System.out.println("Дверь " + title + " открывается");
            changeState();
        }

        public void closedatdoor() {
            System.out.println("Дверь " + title + " закрывается");
            changeState();
        }

        public void changeState() {
            this.closed = !(this.closed);
        }

        @Override
        public String toString() {
            return "Door{" +
                    "closed=" + closed +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Door door = (Door) o;
            return Objects.equals(closed, door.closed);
        }

        @Override
        public int hashCode() {
            return Objects.hash(closed);
        }
    }
}
