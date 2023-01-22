package objects;

import java.util.Objects;

public class Place {
    private String title;


    public Place(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(title, place.title);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

}


