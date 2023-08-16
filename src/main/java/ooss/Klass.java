package ooss;

import java.util.Objects;

public class Klass {
    private final int id;
    private Student student;
    private Teacher teacher;
    private Student leaderName;

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

    public void assignLeader(Student studentLeader) {
        if (studentLeader.isIn(this)) {
            this.leaderName = studentLeader;
            if(teacher != null){
                System.out.println(teacher.introduceWith("I am",
                        studentLeader.getName(), "become Leader"));
            }else if(teacher == null && student != null){
                System.out.println(studentLeader.introduceWith("I am",studentLeader.getName()
                ,student.getName()));
            }
        } else System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return this.leaderName == student;
    }

    public void attach(Teacher teacher){
        this.teacher = teacher;
    }
    public void attach(Student student){
        this.student = student;
    }
}
