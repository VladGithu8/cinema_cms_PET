package com.pet.project.cinemacms;

import com.pet.project.cinemacms.Models.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pet.project.cinemacms.Service.ServiceInterface.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TestUsingJDBC {

    @Autowired
    private CustomerService customerService;

    @Test
    public void testCustomerRepositoryGetMethodUsingJDBC() throws SQLException, ClassNotFoundException {

        List<String> resultJDBCList = new ArrayList<>();
        Connection connection = JBDCConnection.createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
        while (resultSet.next()) {
            String resultSetStrings = resultSet.getLong(1) + " : " + resultSet.getString(2);
            resultJDBCList.add(resultSetStrings);

        }
        connection.close();


        Customer customer1 = this.customerService.getCustomerByID(1L);
        String customer1ToString = customer1.getId() + " : " + customer1.getAge();

        Customer customer2 = this.customerService.getCustomerByID(2L);
        String customer2ToString = customer2.getId() + " : " + customer2.getAge();

        Customer customer3 = this.customerService.getCustomerByID(3L);
        String customer3ToString = customer3.getId() + " : " + customer3.getAge();

        List<String> resultSpringDataList = new ArrayList<>();
        resultSpringDataList.add(customer1ToString);
        resultSpringDataList.add(customer2ToString);
        resultSpringDataList.add(customer3ToString);

        System.out.println("-------------------------JDBC starts-------------------------");
        resultJDBCList.forEach(System.out::println);
        System.out.println("-------------------------JDBC ends-------------------------");

        System.out.println("-------------------------Spring Data starts-------------------------");
        resultSpringDataList.forEach(System.out::println);
        System.out.println("-------------------------Spring Data ends-------------------------");

        assertEquals(resultJDBCList, resultSpringDataList);
    }


    @Test
    public void testCustomerRepositorySaveMethodUsingJDBC() throws SQLException, ClassNotFoundException {

        String customerIdJDBC = "6";
        String sqlInsert = "INSERT INTO customer " +
                "(customer_id, age, credit_card, email, first_name, gender, last_name, nick_name, phone)" +
                " VALUES ("+customerIdJDBC+",'21', '1212343456567878', 'testmail1@test.com', 'TestName1', 'Other1', 'TestLastName1', 'TestNickName1', '1123123')";

        Connection connection = JBDCConnection.createConnection();
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sqlInsert);

        if(rows > 0){
            System.out.println("-------------------------Insert JDBC true-------------------------");
        }

        Customer customer = this.customerService.getCustomerByID(6L);
        long customerIdSpringData = customer.getId();

        System.out.println("Get customer by Spring Data inserted by JDBC:");
        System.out.println(customer.toString());


        assertEquals(Integer.parseInt(customerIdJDBC), customerIdSpringData);

    }
}




