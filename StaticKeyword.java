class Student{
    String name;
   static String school;
}


public class StaticKeyword {
    public static void main(String[] args) {
        Student.school="ABC";

        Student st=new Student();
        st.name="prince";
        System.out.println(st.name);
        System.out.println(Student.school);
    }
}
