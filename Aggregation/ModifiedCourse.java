public class ModifiedCourse {
    private String courseName;
    private Instructor firstInstructor;
    private Instructor secondInstructor;
    private Textbook firstTextbook;
    private Textbook secondTextbook;

    public ModifiedCourse(String courseName, Instructor firstInstructor, Instructor secondInstructor,
                          Textbook firstTextbook, Textbook secondTextbook) {
        this.courseName =  courseName;
        this.firstInstructor = firstInstructor;
        this.secondInstructor = secondInstructor;
        this.firstTextbook = firstTextbook;
        this.secondTextbook = secondTextbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getFirstInstructor() {
        return firstInstructor;
    }

    public void setFirstInstructor(Instructor firstInstructor) {
        this.firstInstructor = firstInstructor;
    }

    public Instructor getSecondInstructor() {
        return secondInstructor;
    }

    public void setSecondInstructor(Instructor secondInstructor) {
        this.secondInstructor = secondInstructor;
    }

    public Textbook getFirstTextbook() {
        return firstTextbook;
    }

    public void setFirstTextbook(Textbook firstTextbook) {
        this.firstTextbook = firstTextbook;
    }

    public Textbook getSecondTextbook() {
        return secondTextbook;
    }

    public void setSecondTextbook(Textbook secondTextbook) {
        this.secondTextbook = secondTextbook;
    }

    public void print() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("First Instructor: " + firstInstructor.getFirstName() + " " + firstInstructor.getLastName());
        System.out.println("First Instructor's Office Number: " + firstInstructor.getOfficeNumber());
        System.out.println("Second Instructor: " + secondInstructor.getFirstName() + " " + secondInstructor.getLastName());
        System.out.println("Second Instructor's Office Number: " + secondInstructor.getOfficeNumber());
        System.out.println("First Textbook Title: " + firstTextbook.getTitle());
        System.out.println("First Textbook Author: " + firstTextbook.getAuthor());
        System.out.println("First Textbook Publisher: " + firstTextbook.getPublisher());
        System.out.println("Second Textbook Title: " + secondTextbook.getTitle());
        System.out.println("Second Textbook Author: " + secondTextbook.getAuthor());
        System.out.println("Second Textbook Publisher: " + secondTextbook.getPublisher());
    }
}