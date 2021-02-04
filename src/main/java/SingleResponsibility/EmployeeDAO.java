package SingleResponsibility;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class EmployeeDAO {

    private static final Logger logger = Logger.getLogger(EmployeeDAO.class);

    public void save(Employee employee) throws SQLException{

        ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
        connectionDAO.setDbms("mysql");
        connectionDAO.setServerName("localhost");
        connectionDAO.setPortNumber("8080");
        connectionDAO.setDbName("mock");

        try (Connection connection = connectionDAO.createConnection();
             Statement stmt = connection.createStatement();) {

            String sql = "insert into employee (id, name, salary) values (" + employee.getId() + "," +
                    employee.getName() + "," + employee.getSalary() + ")";
            int rs = stmt.executeUpdate(sql);

            if (rs == 1){
                logger.info("Successfully inserted Employee - id:" + employee.getId());
            }
        } catch (SQLException e) {
            logger.error("No employee inserted." + e);
        }
    }
}
