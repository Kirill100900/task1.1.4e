package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ден", "Иванович", (byte) 12);
        userService.saveUser("Саня", "Дмитриевич", (byte) 23);
        userService.saveUser("Вася", "Пупкин", (byte) 34);
        userService.saveUser("Аня", "Струнина", (byte) 25);

        System.out.println(userService.getAllUsers());

//        userService.removeUserById(2);

        userService.saveUser("Костя", "Викторович", (byte) 33);

        userService.cleanUsersTable();
    }
}