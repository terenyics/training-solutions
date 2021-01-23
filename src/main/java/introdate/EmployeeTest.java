package introdate;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee(1980,01,01, "John Doe");
        System.out.println("Munkavállaló neve: " + employee.getName() + ", szül. dátuma: " + employee.getDateOfBirth());
        System.out.println("Belépés dátuma: " + employee.getBeginEmployment());
    }
}
