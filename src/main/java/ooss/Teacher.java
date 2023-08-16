package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Klass klass;
    private Student student;
    private List<Klass> listOfKlass;
    public Teacher(int id, String name, int age) {

        super(id, name, age);
        this.listOfKlass = new ArrayList<>();
    }

    @Override
    public String introduce(){


        return super.introduce()+
                String.format(" I am a teacher. I teach Class %s.",assignedClass());
    }
    private String assignedClass(){
        return this.listOfKlass.stream()
                .map(klass1 -> String.valueOf(klass1.getId()))
                .collect(Collectors.joining(", "));
    }

    public void assignTo(Klass klass){
        this.listOfKlass.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.listOfKlass != null && this.listOfKlass.contains(klass);
    }


    public boolean isTeaching(Student student){
        return this.listOfKlass.contains(student.getKlass());
    }
}
