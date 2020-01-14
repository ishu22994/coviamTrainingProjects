package com.training;


import java.sql.*;

public class JdbcInsertDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Employee emp = new Employee();
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/trainingdb","training","training");
        Statement statement = connection.createStatement();

        int rowUpdated = statement.executeUpdate("INSERT INTO employee (first_name,last_name,email) VALUES ('de', 'kdjbfk', 'fbkwje@gmail.com')");
        System.out.println("Rows Updated: "+ rowUpdated);

        ResultSet resultSet = statement.executeQuery("select id,first_name,last_name,email from employee");
        while (resultSet.next()){
            //Integer userId = resultSet.getInt("id");
            emp.setFistName(resultSet.getString(2));
            emp.setLastName(resultSet.getString(3));
            emp.setEmail(resultSet.getString(4));
            System.out.println(emp.toString());
        }

       // int rowDelete = statement.executeUpdate("delete from employee where first_name='Harsh'");


        statement.close();
        connection.close();

    }

}
