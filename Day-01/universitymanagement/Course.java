package universitymanagement;

 import java.util.List;
 import java.util.ArrayList;

class Course<T extends CourseType> {
    private List<T> courses;

    public Course() {
        courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(T course) {
        courses.add(course);
    }

    // Method to get all courses
    public List<T> getAllCourses() {
        return courses;
    }

    // Static method to display courses using wildcards
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}