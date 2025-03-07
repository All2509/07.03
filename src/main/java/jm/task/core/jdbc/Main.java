package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

                UserServiceImpl userService = new UserServiceImpl();

                // 1. Создание таблицы
                userService.createUsersTable();

                // 2. Добавление пользователей
                userService.saveUser("Ivan", "Ivanov", (byte) 25);
               System.out.println("User с именем " + "Ivan" + " добавлен в базу данных.");

                userService.saveUser("Petr", "Petrov", (byte) 30);
                System.out.println("User с именем " + "Petr" + " добавлен в базу данных.");

                userService.saveUser("Sergey", "Sergeev", (byte) 22);
                System.out.println("User с именем " + "Sergey" + " добавлен в базу данных.");

                userService.saveUser("Anna", "Sidorova", (byte) 28);
                System.out.println("User с именем " + "Anna" + " добавлен в базу данных.");

                // 3. Получение всех пользователей и вывод в консоль
                userService.getAllUsers().forEach(user -> System.out.println(user.toString()));

                // 4. Очистка таблицы
               userService.cleanUsersTable();

                // 5. Удаление таблицы
                userService.dropUsersTable();

    }
}

