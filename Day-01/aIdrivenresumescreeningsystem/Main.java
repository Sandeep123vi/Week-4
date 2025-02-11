package aIdrivenresumescreeningsystem;

public class Main {
    public static void main(String[] args) {
        // Creating resume processors for different job roles
        Resume<SoftwareEngineer> softwareEngineerResumes = new Resume<>();
        Resume<DataScientist> dataScientistResumes = new Resume<>();
        Resume<ProductManager> productManagerResumes = new Resume<>();

        // Adding resumes
        softwareEngineerResumes.addResume(new SoftwareEngineer("Alice", 5));
        softwareEngineerResumes.addResume(new SoftwareEngineer("Bob", 3));

        dataScientistResumes.addResume(new DataScientist("Charlie", 4));
        dataScientistResumes.addResume(new DataScientist("David", 6));

        productManagerResumes.addResume(new ProductManager("Eve", 7));
        productManagerResumes.addResume(new ProductManager("Frank", 10));

        // Screening resumes dynamically
        System.out.println("\nSoftware Engineer Resumes:");
        Resume.screenResumes(softwareEngineerResumes.getAllResumes());

        System.out.println("\nData Scientist Resumes:");
        Resume.screenResumes(dataScientistResumes.getAllResumes());

        System.out.println("\nProduct Manager Resumes:");
        Resume.screenResumes(productManagerResumes.getAllResumes());
    }
}
