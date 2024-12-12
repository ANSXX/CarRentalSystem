import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/car_rental";
    private static final String USER = "root";  // Use your MySQL username
    private static final String PASSWORD = ""; // Use your MySQL password

    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConnection() throws SQLException {
        try {
            // Explicitly load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found. Ensure the driver JAR is in the classpath.");
            e.printStackTrace();
            throw new SQLException("Driver not found.");
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
