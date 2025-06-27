package oop2;

public class StaticConceptsDemo {

    // 1. Static variable
    static String companyName;

    // 2. Non-static variable
    String employeeName;

    // 3. Static block to initialize static variables
    static {
        companyName = "Zoho Corp";
        System.out.println("Static block executed. Company initialized.");
    }

    // 4. Constructor to set non-static field
    StaticConceptsDemo(String employeeName) {
        this.employeeName = employeeName;
    }

    // 5. Static method
    static void displayCompany() {
        System.out.println("Company Name (static): " + companyName);

        // Cannot access non-static variable directly
        // System.out.println(employeeName); // ERROR

        // Correct way: create an object
        StaticConceptsDemo temp = new StaticConceptsDemo("Hari");
        System.out.println("Accessing non-static from static via object: " + temp.employeeName);

        // this keyword inside static method (uncomment to see error)
        // System.out.println(this.companyName); // ERROR
    }

    // 6. Non-static method
    void displayEmployee() {
        System.out.println("Employee Name (non-static): " + employeeName);

        // Can directly access static member
        System.out.println("Company from non-static method: " + companyName);
    }

    public static void main(String[] args) {
        // Access static method
        StaticConceptsDemo.displayCompany();

        // Create object and access non-static method
        StaticConceptsDemo emp1 = new StaticConceptsDemo("Hari");
        emp1.displayEmployee();

        StaticConceptsDemo emp2 = new StaticConceptsDemo("Atch");
        emp2.displayEmployee();

        // Modify static variable (affects all objects)
        StaticConceptsDemo.companyName = "Dayforce Technologies";

        emp1.displayEmployee(); // Shows updated company name
        emp2.displayEmployee();
    }
}
