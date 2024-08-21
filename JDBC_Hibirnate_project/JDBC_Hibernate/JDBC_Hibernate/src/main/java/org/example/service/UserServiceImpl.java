package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoHibernateImpl;
import org.example.dao.UserDaoJDBCImpl;
import org.example.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в БД");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = null;

        try {
            users = userDao.getAllUsers();


            if (users != null && !users.isEmpty()) {

                users.forEach(System.out::println);
            } else {
                System.out.println("Нет пользователей в базе данных.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
