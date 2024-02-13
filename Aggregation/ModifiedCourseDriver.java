public class ModifiedCourseDriver {
    public static void main(String[] args) {
        Instructor firstInstructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor secondInstructor = new Instructor("Keivan", "Navi", "8-4");
        Textbook firstTextbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook secondTextbook = new Textbook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Scholastic Inc.");
        ModifiedCourse softwareEngineering = new ModifiedCourse("Software Engineering", firstInstructor, secondInstructor,
                firstTextbook, secondTextbook);
        softwareEngineering.print();
    }
}
