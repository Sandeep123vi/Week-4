package universitymanagement;

public class Main {
    public static void main(String[] args) {
        // Creating course managers for different types
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Adding courses
        examCourses.addCourse(new ExamCourse("Mathematics", "Dr. Smith"));
        examCourses.addCourse(new ExamCourse("Physics", "Dr. Johnson"));

        assignmentCourses.addCourse(new AssignmentCourse("History", "Prof. Brown"));
        assignmentCourses.addCourse(new AssignmentCourse("Philosophy", "Dr. White"));

        researchCourses.addCourse(new ResearchCourse("AI Research", "Dr. Allen"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing", "Dr. Green"));

        // Display courses dynamically using wildcard method
        System.out.println("Exam-Based Courses:");
        Course.displayCourses(examCourses.getAllCourses());

        System.out.println("\nAssignment-Based Courses:");
        Course.displayCourses(assignmentCourses.getAllCourses());

        System.out.println("\nResearch-Based Courses:");
        Course.displayCourses(researchCourses.getAllCourses());
    }
}
