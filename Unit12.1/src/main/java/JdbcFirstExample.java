import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFirstExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        String url = "jdbc:oracle:thin:@27.118.22.14:1521:orcl";
        try {
            connection = DriverManager.getConnection(url, "SCOTT", "SCOTT");
            statement = connection.createStatement();
            String sql  = "create table student_kb (\n" +
                    "    st_id number primary key," +
                    "    st_name varchar(50)," +
                    "    st_age int " +
                    ")";
            System.out.println(statement.execute(sql));
            System.out.println("đã kết nối");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }
}
