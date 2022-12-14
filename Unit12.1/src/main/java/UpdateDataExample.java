import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateDataExample {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            preparedStatement = connection.prepareStatement("Update student_kb set st_name = ? where st_id = ?");

            preparedStatement.setString(1, "Trung Kiên");
            preparedStatement.setInt(2, 0);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
