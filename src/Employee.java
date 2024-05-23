public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Tailor", "Manager", "john.doe@test.com", "565-184", 50000, 35);
        employees[1] = new Employee("Jane Smith", "Developer", "jane.smith@test.com", "523-689", 60000, 28);
        employees[2] = new Employee("Mike Johnson", "Designer", "mike.johnson@test.com", "515-901", 55000, 30);
        employees[3] = new Employee("Emily Brown", "Sales Representative", "emily.brown@test.com", "555-456", 45000, 32);
        employees[4] = new Employee("Alex Wilson", "Accountant", "alex.wilson@test.com", "501-614", 65000, 40);

        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}