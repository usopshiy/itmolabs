package objects;

import java.util.ArrayList;
import java.util.Objects;

import interfaces.Holdable;
import interfaces.Holding;

public class Report implements Holdable {

    private ArrayList<String> data;
    public Report(ArrayList<String> d){
        this.data = d;
    }

    public ArrayList<String> getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(data, report.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return "Report{" +
                "data=" + data +
                '}';
    }

    @Override
    public void giveTo(Holding h) {
        h.pickUp(this);
    }
}
