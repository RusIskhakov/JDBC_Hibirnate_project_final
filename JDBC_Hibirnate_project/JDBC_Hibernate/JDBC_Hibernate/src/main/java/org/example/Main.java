package org.example;

import org.example.service.UserService;
import org.example.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();


        userService.saveUser("Ivan", "Ivaonov", (byte) 12);
        userService.saveUser("John", "Ivaonov", Byte.parseByte("23"));
        userService.saveUser("Mikhail", "Jmishenko", Byte.parseByte("54"));
        userService.saveUser("Nikita", "Petrov", Byte.parseByte("5"));

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
