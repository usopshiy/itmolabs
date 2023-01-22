package characters;

import objects.Place;
import interfaces.Holdable;
import interfaces.Holding;
import objects.*;

import java.util.Objects;

public class Boss extends Person implements Holding {
    private Holdable item;
    private Report rep;

    public Boss(String name, Place pos) {
        super(name);
        this.position = pos;
    }

    public void giveTask(Detective d, Person p) {
        System.out.println(this.getName() + " передает дело опытному сыщику " + d.getName());
        d.spy(p);
        d.giveReport(this);
        this.readReport(this.rep);
    }

    public void readReport(Report r) {
        System.out.println(this.getName() + " Изучает отчёт");
    }

    public void tellResults(Person p) {
        for (String data : this.rep.getData()) {
            System.out.println(this.getName() + " сообщает " + p.getName() + " " + data);
        }
    }

    @Override
    public void pickUp(Holdable h) {
        if (h.getClass() == Report.class) {
            this.rep = (Report) h;
        } else {
            this.item = h;
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boss boss = (Boss) o;
        return Objects.equals(item, boss.item) && Objects.equals(rep, boss.rep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), item, rep);
    }

    @Override
    public void drop(Holdable h) {
        this.item = null;
    }
}