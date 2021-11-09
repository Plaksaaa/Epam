package by.epamtc.krukovichmaxim.library_task.dao;

import by.epamtc.krukovichmaxim.library_task.entity.Book;
import by.epamtc.krukovichmaxim.library_task.exception.DaoException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public void removeBook(Book book) throws DaoException {
        List<Book> books = readBooks();

        books.remove(book);
        try (FileWriter writer = new FileWriter(PATH)) {
            writer.write("");
        } catch (Exception e) {
            throw new DaoException("Файл книг не найден или повреждён");
        }

        for (Book currentBook : books) {
            addBook(currentBook);
        }
    }

    public List<Book> readBooks() throws DaoException {
        List<Book> result = new ArrayList<>();
        String current;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            while ((current = reader.readLine()) != null) {
                result.add(new Book(current));
            }
        } catch (Exception e) {
            throw new DaoException("Файл книг не найден или повреждён");
        }
        return result;
    }

    public void addBook(Book book) throws DaoException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true)) {

        } catch (Exception e) {
            throw new DaoException("Файл книг не найден или повреждён", e);
        }
    }

}
