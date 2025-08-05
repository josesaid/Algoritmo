package com.mx.development.statements;

import java.sql.*;

import static com.mx.development.DatabaseConstants.*;

/**
 * Clase que inserta un registro en la tabla 'empleados' en una base de datos MySQL
 * utilizando CallableStatement para llamar un procedimiento almacenado
 * que retorna el ID generado automáticamente.
 *
 * Asegúrate de que el SP 'insertar_empleado' exista en la BD.
 *
 * @author josesaidolanogarcia
 */
public class CallableStatementInsertEmployee {

    public static void main(String[] args) {
        // Datos del nuevo empleado
        String nombre = "Daleyma2";
        String apellidoPaterno = "Quispe";
        String apellidoMaterno = "Calle";
        String email = "daleyma.quispe@codegym.com";

        // Llamada al stored procedure
        String call = "{CALL algoritmo.insertar_empleado(?, ?, ?, ?, ?)}";

        try (Connection conn = DriverManager.getConnection(MYSQL_DATABASE_URL, MYSQL_DATABASE_USER, MYSQL_DATABASE_PASSWORD);
             CallableStatement cstmt = conn.prepareCall(call)) {

            // Establecer los parámetros de entrada
            cstmt.setString(1, nombre);
            cstmt.setString(2, apellidoPaterno);
            cstmt.setString(3, apellidoMaterno);
            cstmt.setString(4, email);

            // Registrar el parámetro de salida
            cstmt.registerOutParameter(5, Types.INTEGER);

            // Ejecutar el procedimiento
            cstmt.execute();

            // Obtener el ID generado
            int idGenerado = cstmt.getInt(5);
            System.out.println("Empleado insertado exitosamente. ID generado: " + idGenerado);

        } catch (SQLException e) {
            System.err.println("Error al insertar empleado: " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }
}
