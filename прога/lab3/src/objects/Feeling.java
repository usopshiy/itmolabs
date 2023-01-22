package objects;

import java.util.Objects;

public class Feeling {

    public Feeling(String title){
        this.title = title;
    }
    private String title;

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o.getClass().equals(String.class) || o.getClass().equals(this.getClass()))) return false;
        return o.toString().equals(this.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
