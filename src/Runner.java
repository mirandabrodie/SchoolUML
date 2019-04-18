public class Runner {

    public static void main(String[]args){
        School berkeleyHigh = new School("Berkeley High");

        Section math = new Section("Math");
        Section english = new Section("English");
        Section compSci = new Section("Computer Science");

        Teacher albinson = new Teacher(" Mr. Albinson", 11);
        Teacher jimenez = new Teacher("Ms. Jimenez", 12);
        Teacher goldman = new Teacher("Mr. Goldman", 13);

        Student miranda = new Student("Miranda", 21, 12);
        Student roni = new Student("Roni", 22, 12);
        Student taylor = new Student("Taylor", 23, 12);
        Student maren = new Student("Maren", 24, 12);
        Student sophia = new Student("Sophia", 25, 12);
        Student ava = new Student("Ava", 26, 12);

        albinson.addSection(compSci);
        compSci.setTeacher(albinson);

        jimenez.addSection(english);
        english.setTeacher(jimenez);

        goldman.addSection(math);
        math.setTeacher(goldman);


        miranda.addSection(english);
        roni.addSection(english);
        sophia.addSection(english);
        taylor.addSection(english);

        english.addStudent(miranda);
        english.addStudent(roni);
        english.addStudent(sophia);
        english.addStudent(taylor);

        taylor.addSection(math);
        ava.addSection(math);
        maren.addSection(math);
        sophia.addSection(math);

        math.addStudent(taylor);
        math.addStudent(ava);
        math.addStudent(maren);
        math.addStudent(sophia);


        miranda.addSection(compSci);
        roni.addSection(compSci);
        ava.addSection(compSci);
        maren.addSection(compSci);

        compSci.addStudent(miranda);
        compSci.addStudent(roni);
        compSci.addStudent(ava);
        compSci.addStudent(maren);

        System.out.println(math.toString());
        System.out.println(english.toString());
        System.out.println(compSci.toString());
    }
}
