package aIdrivenresumescreeningsystem;
import java.util.*;

class Resume<T extends JobRole> {
    private List<T> resumes;

    public Resume() {
        resumes = new ArrayList<>();
    }

    // Method to add a resume
    public void addResume(T resume) {
        resumes.add(resume);
    }

    // Method to get all resumes
    public List<T> getAllResumes() {
        return resumes;
    }

    // Generic method to process and screen resumes dynamically
    public static <T extends JobRole> void screenResumes(List<T> resumes) {
        System.out.println("Screened Resumes:");
        for (T resume : resumes) {
            System.out.println(resume);
        }
    }
}