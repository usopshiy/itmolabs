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

    public void tellSmth(String s, Person p){
        System.out.println(p.getName() + " узнает от " + name +  ", что " + s);
    }

    public void getConcious(Person p1, Person p2){
        System.out.println(p1.getName() + " испугался и приподняв " + this.getName() + " за талию, начинает трясти ее изо всех сил");
        p1.setFeel(new Feeling("напуган"));
        System.out.println(p2.getName() + " брызгает одеколоном на лицо " + this.getName());
        System.out.println(this.getName() + " приходит в сознание");
        this.setState(new State("Нормальное"));
    }
    public void receiveBadNews(){
        System.out.println(name + " Полуает известие");
        System.out.println(name + " Почти падает в обморок");
    }

    public void startPlanN(Person p1, Person p2){
        System.out.println(name + " Вызывает из " + p1.position + " " + p1.getName() + " " +
                "и велит ему отвезти ее вместе с " + p2.getName() + " туда, где он видел Незнайку с её любимцами");
    }
    public void sitNDream(){
        this.setState(new State("Мечтает"));
        System.out.println(name + " сидит в " + this.position + " и придается мечтам");
    }

    public void smellDog(Dog dog){
        if(dog.getSmell() == Smell.RATTY){
            System.out.println(this.getName() + " чувствует, что ее любимая " + dog.toString() + " пахнет крысами");
            this.setState(new State("Подозревает"));
        }
    }

    public void lookAroundForDogs(Dog d1, Dog d2){
        if(d1.position.equals(d2.position)){
            System.out.println(this.getName() + " видит " + d1 + " лежащего на грязном " + d1.position);
            System.out.println(this.getName() + " видит " + d2 + " с " + d2.getItem() + " в зубах");
            System.out.println(this.getName() + " взвизгивает и, закатив глаза, падает в обморок");
            this.setState(new State("в обмороке"));
        }
    }

    public void examineDog(Dog d){
        System.out.println(this.getName() + " смотрит на " + d);
        if(d.getItem().getClass().equals(Rat.class)){
            System.out.println(this.getName() + " видит в зубах у " + d + " " + d.getItem());
            System.out.println(this.getName() + " кричит");
        }
        else{System.out.println("С " + d + " все в порядке");}
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
