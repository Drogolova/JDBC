import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {
        final String user = "postgres";
        final String password = "zsefvcx8";
        final String url = "jdbc:postgresql://localhost:5432/postgres";

        try (final Connection connection = DriverManager.getConnection(url, user, password)) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)");

            statement.setInt(1, 2);
            final ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String firstName = "First name: " + resultSet.getString("first_name");
                String lastName = "Last name: " + resultSet.getString("last_name");
                String gender = "Gender: " + resultSet.getString("gender");
                String city_id = "City id: " + resultSet.getString("city_id");

                System.out.println(firstName);
                System.out.println(lastName);
                System.out.println(gender);
                System.out.println(city_id);
            }
        }

        Connection connection = DriverManager.getConnection(url, user, password);
        EmployeeDAO employeeDAO = new EmployeeDAOImpl(connection);
        System.out.println(employeeDAO.getEmployee(2));
        System.out.println(employeeDAO.getAllEmployees());
        City city = new City(1, "Moscow");
        Employee employee = new Employee("Nadya", "Drogolova", "female", 26, city);
        employeeDAO.updateEmployee(2, employee);
        employeeDAO.deleteEmployee(6);
    }

}
