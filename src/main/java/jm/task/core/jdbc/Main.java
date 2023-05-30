package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDao userDao = new UserDaoJDBCImpl();

        //1.  Создание таблицы User(ов)
        userDao.createUsersTable();

        //2.  Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод
        // в консоль ( User с именем – name добавлен в базу данных )
        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);

        //3.  Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
        for (int i = 0; i < userDao.getAllUsers().size(); i++) {
            System.out.println(userDao.getAllUsers().get(i).toString());
        }

        //4.  Очистка таблицы User(ов)
        userDao.cleanUsersTable();

        //5.  Удаление таблицы
        userDao.dropUsersTable();
    }
}
