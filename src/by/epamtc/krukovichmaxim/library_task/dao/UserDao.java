package by.epamtc.krukovichmaxim.library_task.dao;

import by.epamtc.krukovichmaxim.library_task.entity.User;
import by.epamtc.krukovichmaxim.library_task.exception.DaoException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public void addUser(User user) throws DaoException {
        try (FileWriter fos = new FileWriter(PATH, true)) {
            fos.append(user.toFileString()).append("\n");
        } catch (Exception e) {
            throw new DaoException("Файл пользователей не найден или повреждён");
        }
    }

    public List<User> readUsers() throws DaoException {
        List<User> result = new ArrayList<>();
        String current;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            while ((current = reader.readLine()) != null) {
                result.add(new User(current));
            }
        } catch (Exception e) {
            throw new DaoException("Файл пользователей не найден или повреждён");
        }
        return result;
    }
}
