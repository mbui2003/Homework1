public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName =  courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void print() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook Title: " + textbook.getTitle());
        System.out.println("Textbook Author: " + textbook.getAuthor());
        System.out.println("Textbook Publisher: " + textbook.getPublisher());
    }
}
