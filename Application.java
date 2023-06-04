import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        City city = new City(9, "Novosibirsk");
        Employee employee = new Employee(12, "Helen", "Korovina", "female", 25, city);
        employeeDAO.addEmployee(employee);
        City city2 = new City(10, "Vladivostok");
        Employee employee2 = new Employee(12, "Pavel", "Belov", "male", 32, city2);
        employeeDAO.updateEmployee(employee2);
        employeeDAO.deleteEmployee(employee2);

//        cityDAO.addCity(new City(8, "Anapa"));
//
//        Employee employee1 = new Employee("Irina", "Belyaeva", "female", 26, null);
//        employeeDAO.addEmployee(employee1);
//        System.out.println(employeeDAO.getEmployee(8));
//        List<Employee> employees  = employeeDAO.getAllEmployees();
//
//        for(Employee employee : employees) {
//            System.out.println(employee);
//        }

//        Employee employee2 = new Employee(4, "Darya", "Ivanova", "female", 27, null);
//        employeeDAO.updateEmployee(employee2);
//        employeeDAO.deleteEmployee(employee2);


//        System.out.println(employeeDAO.getEmployee(2));
//        System.out.println(employeeDAO.getAllEmployees());
//        City city = new City(1, "Moscow");
//        Employee employee = new Employee("Nadya", "Drogolova", "female", 26, city);
//        employeeDAO.updateEmployee(employee);
//        employeeDAO.deleteEmployee(employee);
    }

}
