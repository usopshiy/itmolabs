package characters;

import interfaces.Holdable;
import interfaces.Holding;
import interfaces.Spyable;
import objects.Place;
import objects.Report;

import java.util.Objects;
public class Detective extends Person implements Holding{
    private Holdable item;
    public Detective(String name, Place pos) {
        super(name);
        this.position = pos;
    }

    public Holdable getItem() {
        return item;
    }

    public void giveReport(Boss bur) {
            System.out.println(this.getName() + " передает отчет " + bur);
            this.item.giveTo(bur);
            drop(this.item);
    }

    public void spy(Spyable s){
        System.out.println(this.getName() + " неуступно следит за " + s + " в течение 3 дней");
        Report report = new Report(s.beSpyed());
        this.pickUp(report);
    }


    @Override
    public String toString() {
        return "Detective{" +
                this.getName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Detective detective = (Detective) o;
        return Objects.equals(item, detective.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), item);
    }

    @Override
    public void pickUp(Holdable h) {
        this.item = h;
    }

    @Override
    public void drop(Holdable h) {
        this.item = null;
    }
}
