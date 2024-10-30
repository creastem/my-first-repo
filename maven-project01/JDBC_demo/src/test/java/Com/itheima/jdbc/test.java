package Com.itheima.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test {
    @Test
    public void testUpdate() throws Exception {
        //1.注册驱动
        Class.forName("Com.mysql.cj.jdbc.Driver");
        //2.连接数据库
        String url="jdbc:mysql://localhost:3306/web01";
        String username="root";
        String password="changan5230";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.获取SQL语句执行对象
        Statement statement = connection.createStatement();
        //4.指定SQL语句
        int i = statement.executeUpdate("update user set age=25 where id =1");
        //5.释放资源
        statement.close();
        connection.close();
    }
}
