package ooss;

public class Student extends Person {
    private Klass klass;
    private final String name;

    public Student(int id, String name, int age) {

        super(id, name, age);
        this.name = name;
    }
    @Override
    public String introduce(){
        if(klass == null)
            //TODO .format is redundant and just add the string using concat or other method
            return super.introduce() + String.format(" I am a student.");
        else if (klass.isLeader(this)) {
            return super.introduce()+ String.format(" I am a student. I am the leader of class %d.",klass.getId());

        }
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

    public String getName(){
        return this.name;
    }

// TODO introduceWith method can be moved to klass
    public String introduceWith(String prompt, String leaderName, String studentName) {
        return String.format("%s %s, student of Class %d. I know %s become Leader.",
                prompt,studentName,getId(),leaderName);
    }
    //TODO add more description to the git commits
}
