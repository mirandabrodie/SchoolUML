import java.util.Arrays;

public class Section {

    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name){
        this.teacher = teacher;
        this.name = name;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize ++;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String role = "" ;
        for(int i = 0; i < currentSize; i++){
            if(i < currentSize - 1){
                role += (students[i].getName() + ", ");
            }else{
                role += ("and " + students[i].getName());
            }
        }
        return "This " + name + " class is taught by " +
                teacher.getName() + ", and has " + currentSize +
                " students: " + role;
    }
}
