package by.epamtc.krukovichmaxim.library_task.entity;

import java.io.Serializable;
import java.util.Objects;

import static java.util.Objects.hash;

public class Book implements Serializable {
    private int bookId;
    private String author;
    private String title;

    public Book(int bookId, String author, String title) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getBookId() == book.getBookId() &&
               Objects.equals(getAuthor(), book.getAuthor()) &&
               Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return hash(getBookId(), getAuthor(), getTitle());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
               "bookId=" + bookId +
               ", author='" + author + '\'' +
               ", title='" + title + '\'' +
               '}';
    }
}
