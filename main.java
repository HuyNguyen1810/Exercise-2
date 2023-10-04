public class main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", "123 Main Street");
        System.out.println(person);

        // Create a Student object
        Student student = new Student("Alice Smith", "456 Elm Street", "Computer Science", 2023, 5000.0);
        System.out.println(student);

        // Create a Staff object
        Staff staff = new Staff("Jane Smith", "789 Oak Street", "XYZ School", 45000.0);
        System.out.println(staff);
    }
}