public class UniversityClient {
    public static void main(String[] args) {
   
        Teacher t1 = new Teacher("Dr. Alice", "Algorithms", 90000);
        Teacher t2 = new Teacher("Dr. Bob",   "Databases", 85000);
        Student s1 = new Student("Carol", "S1001", 12000);
        Student s2 = new Student("Dave",  "S1002", 13000);
        Student s3 = new Student("Eve",   "S1003", 12500);

        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        Department itDept = new Department("Information Technology");
        itDept.add(t2);
        itDept.add(s3);

        College engCollege = new College("College of Engineering");
        engCollege.add(csDept);
        engCollege.add(itDept);

        College sciCollege = new College("College of Sciences");
        sciCollege.add(new Student("Frank", "S2001", 11000));

        College newEraUni = new College("New Era University");
        newEraUni.add(engCollege);
        newEraUni.add(sciCollege);

        System.out.println("=== University Details ===");
        newEraUni.displayDetails("");

        System.out.println("\nTotal number of students: " + newEraUni.getNumberOfStudents());
        System.out.printf("Total University budget: %.2f%n", newEraUni.getBudget());
    }
}
