public class oop {
    private String name;   // private = can't be accessed directly
    private int age;

    // Getter method (to read value)
    public String getName() {
        return name;
    }

    // Setter method (to change value)
    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
    public static void main(String[] args) {
        oop s = new oop();

        s.setName("Khushi");
        s.setAge(20);

        System.out.println(s.getName());  // Output: Khushi
        System.out.println(s.getAge());   // Output: 20
    }
}
