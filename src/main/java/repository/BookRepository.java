package repository;

import model.BookBase;
import model.PrintedBook;
import model.EBook;
import utils.DatabaseConnection;
import exception.DatabaseOperationException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public void create(BookBase book) {
        String sql = "INSERT INTO books (title, book_type, price) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getBookType());
            pstmt.setDouble(3, 10.0);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseOperationException("Error saving book: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows == 0) {
                System.out.println("No book found with ID: " + id);
            }
        } catch (SQLException e) {
            throw new DatabaseOperationException("Error deleting book: " + e.getMessage());
        }
    }
}