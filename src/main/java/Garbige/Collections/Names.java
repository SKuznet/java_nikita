package Garbige.Collections;

import java.util.Objects;

public class Names {
    private String name;

    @Override
    public String
    toString() {
        return "Names{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Names names = (Names) o;
        return Objects.equals(name, names.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



    public Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
