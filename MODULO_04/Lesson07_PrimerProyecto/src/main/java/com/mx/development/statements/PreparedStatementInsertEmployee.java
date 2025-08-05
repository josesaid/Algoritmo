package com.mx.development.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.mx.development.DatabaseConstants.*;

/**
 * Clase que inserta un registro en la tabla 'empleados' en una base de datos MySQL
 * utilizando PreparedStatement para proteger contra SQL Injection.
 * @author josesaidolanogarcia
 */
public class PreparedStatementInsertEmployee {

    // Cambia estos valores según tu configuración de MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/mi_basededatos?useSSL=false&serverTimezone=UTC";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    public static void main(String[] args) {

        // Datos del nuevo empleado
        String nombre = "Andrés";
        String apellidoPaterno = "Morales";
        String apellidoMaterno = "Zapata";
        String email = "andres.morales@example.com";

        // Consulta SQL con placeholders
        String sql = "INSERT INTO empleados (nombre, apellidoPaterno, apellidoMaterno, email) VALUES (?, ?, ?, ?)";

        // Establecer conexión y preparar la sentencia
        try (Connection conn = DriverManager.getConnection(MYSQL_DATABASE_URL, MYSQL_DATABASE_USER, MYSQL_DATABASE_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Establecer los valores de los parámetros
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidoPaterno);
            pstmt.setString(3, apellidoMaterno);
            pstmt.setString(4, email);

            // Ejecutar la inserción
            int filasAfectadas = pstmt.executeUpdate();

            // Confirmar resultado
            if (filasAfectadas > 0) {
                System.out.println("Empleado insertado exitosamente en MySQL.");
            } else {
                System.out.println("No se insertó el empleado.");
            }

        } catch (SQLException e) {
            System.err.println("Error al insertar empleado: " + e.getMessage());
        }
        System.out.println("Fin del programa");

    }

}