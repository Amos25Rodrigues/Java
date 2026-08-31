package com.todoapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:todo.db";

    public static void init() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(
                "CREATE TABLE IF NOT EXISTS tarefas (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "titulo TEXT NOT NULL, " +
                    "concluida INTEGER NOT NULL DEFAULT 0)"
            );
        }
    }

    public static void adicionarTarefa(String titulo) throws SQLException {
        String sql = "INSERT INTO tarefas (titulo, concluida) VALUES (?, 0)";
        try (Connection connection = DriverManager.getConnection(URL);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, titulo);
            preparedStatement.executeUpdate();
        }
    }

    public static void removerTarefa(int id) throws SQLException {
        String sql = "DELETE FROM tarefas WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }

    public static void alternarConcluida(int id) throws SQLException {
        String sql = "UPDATE tarefas SET concluida = CASE WHEN concluida = 0 THEN 1 ELSE 0 END WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }

    public static List<Tarefa> listarTarefas() throws SQLException {
        List<Tarefa> tarefas = new ArrayList<>();
        String sql = "SELECT id, titulo, concluida FROM tarefas ORDER BY id";

        try (Connection connection = DriverManager.getConnection(URL);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String titulo = resultSet.getString("titulo");
                boolean concluida = resultSet.getInt("concluida") == 1;
                tarefas.add(new Tarefa(id, titulo, concluida));
            }
        }

        return tarefas;
    }
}
