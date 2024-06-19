class Student {
    String name;
    int age;
    String regNo;
    String mobile;
    String address;
    String dept;
    int year;

    void studentDetails(String name, int age, String regNo, String mobile, String address, String dept, int year) {
        this.name = name;
        this.age = age;
        this.regNo = regNo;
        this.mobile = mobile;
        this.address = address;
        this.dept = dept;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Mobile: " + mobile);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Year: " + year);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("Student - 1 DETAILS...");
        s1.studentDetails("student1", 21, "12345678", "1234567890", "Guntur", "CSE", 3);
        s1.displayDetails();
        System.out.println("Student - 2 DETAILS...");
        s2.studentDetails("student2", 21, "123789456", "9876543210", "Guntur", "CSE", 3);
        s2.displayDetails();
        System.out.println("Student - 3 DETAILS...");
        s3.studentDetails("student3", 21, "123789457", "9876543211", "Guntur", "CSE", 3);
        s3.displayDetails();

    }
}
