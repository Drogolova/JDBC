import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee employee);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
