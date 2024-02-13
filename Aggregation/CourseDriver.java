public class CourseDriver {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course softwareEngineering = new Course("Software Engineering", instructor, textbook);
        softwareEngineering.print();
    }
}
