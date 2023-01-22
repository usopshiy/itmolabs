package objects;

import java.util.Objects;

public class State {
    private String title;

    public State(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o.getClass().equals(String.class) || o.getClass().equals(Feeling.class))) return false;
        return Objects.equals(this.title, o.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return title;
    }
}
/*DEFAULT,
        PLEASED,
        HAPPY,
        PLAYING,
        SUSPECTING,
        ESCAPING,
        HIDING,
        WAITING*/