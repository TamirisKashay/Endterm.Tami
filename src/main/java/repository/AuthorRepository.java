package repository;

import model.Author;
import utils.DatabaseConnection;
import exception.DatabaseOperationException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorRepository {

    public void create(Author author) {
        String sql = "INSERT INTO authors (name, nationality) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, author.getName());
            pstmt.setString(2, author.getNationality());

            pstmt.executeUpdate();
            System.out.println("Author saved to database: " + author.getName());

        } catch (SQLException e) {
            throw new DatabaseOperationException("Error saving author: " + e.getMessage());
        }
    }
}