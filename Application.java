import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee employee1 = new Employee("Irina", "Belyaeva", "female", 26, 6);
        employeeDAO.addEmployee(employee1);
        System.out.println(employeeDAO.getEmployee(8));
        List<Employee> employees  = employeeDAO.getAllEmployees();

        for(Employee employee : employees) {
            System.out.println(employee);
        }

        Employee employee2 = new Employee(4, "Darya", "Ivanova", "female", 27, 2);
        employeeDAO.updateEmployee(employee2);
        employeeDAO.deleteEmployee(employee2);


//        System.out.println(employeeDAO.getEmployee(2));
//        System.out.println(employeeDAO.getAllEmployees());
//        City city = new City(1, "Moscow");
//        Employee employee = new Employee("Nadya", "Drogolova", "female", 26, city);
//        employeeDAO.updateEmployee(employee);
//        employeeDAO.deleteEmployee(employee);
    }

}
