package ooss;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age) {

        super(id, name, age);
    }
    @Override
    public String introduce(){
        return super.introduce()+
                String.format(" I am a student. I am in class %d.",klass.getId());
    }

    public void join(Klass klass){
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.getId() == klass.getId();
    }

    public int getId(){
        return klass.getId();
    }
    public Klass getKlass(){
        return this.klass;
    }

}
