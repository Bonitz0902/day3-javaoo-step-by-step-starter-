package ooss;

import java.util.Objects;

public class Klass {
    private final int id;
    private Student student;

    public Klass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return id == klass.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void assignLeader(Student student) {
        if (student.isIn(this)) {
            this.student = student;
        } else System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return this.student == student;
    }
}
