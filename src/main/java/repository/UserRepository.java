package repository;

import DataBase.DataBase;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {

    public static void  insertUser(User user) {

        String sql = "INSERT INTO utilisateur (id, nom, prenom, email, mot_de_passe) VALUES (:id, :nom, :prenom, :email, :mot_de_passe)";

        try (Connection connection = DataBase.connexionBdd();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getNom());
            preparedStatement.setString(3, user.getPrenom());
            preparedStatement.setString(4, user.getMail());
            preparedStatement.setString(5, user.getPassword());

            preparedStatement.executeUpdate();
            System.out.println("utilisateur inseré");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
