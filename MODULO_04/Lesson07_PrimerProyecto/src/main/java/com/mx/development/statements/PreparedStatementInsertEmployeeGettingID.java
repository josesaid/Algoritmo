package com.mx.development.statements;
import java.sql.*;

import static com.mx.development.DatabaseConstants.*;

/**
 * Clase que inserta un registro en la tabla 'empleados' en MySQL
 * y retorna el ID generado automáticamente.
 * @author josesaidolanogarcia
 */
public class PreparedStatementInsertEmployeeGettingID {

    // Datos de conexión (ajusta según tu entorno)


    /**
     * Inserta un empleado y devuelve su ID generado.
     *
     * @param nombre           Nombre del empleado
     * @param apellidoPaterno Apellido paterno
     * @param apellidoMaterno Apellido materno
     * @param email            Email
     * @return ID generado o -1 si hubo un error
     */
    public static long insertarEmpleado(String nombre, String apellidoPaterno, String apellidoMaterno, String email) {

        // Consulta SQL con retorno de claves generadas
        String sql = "INSERT INTO empleados (nombre, apellidoPaterno, apellidoMaterno, email) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(
                MYSQL_DATABASE_URL, MYSQL_DATABASE_USER, MYSQL_DATABASE_PASSWORD);
             // Se indica que se quiere recuperar claves generadas
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // Asignar valores al statement
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellidoPaterno);
            pstmt.setString(3, apellidoMaterno);
            pstmt.setString(4, email);

            // Ejecutar el INSERT
            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas == 0) {
                System.out.println("No se insertó ningún registro.");
                return -1;
            }

            // Obtener el ID generado
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    //long idGenerado = generatedKeys.getLong(1);
                    long idGenerado = generatedKeys.getInt(1);
                    System.out.println("Empleado insertado con ID: " + idGenerado);
                    return idGenerado;
                } else {
                    System.out.println("No se generó ID.");
                    return -1;
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al insertar empleado: " + e.getMessage());
            return -1;
        }
    }

    // Método main de prueba
    public static void main(String[] args) {
        long id = insertarEmpleado("Juana", "Morales", "Zapata", "juan.morales@example.com");
        if (id > 0) {
            // Aquí podrías usar el ID para otro propósito (por ejemplo, insertar en otra tabla)
            System.out.println("ID generado disponible para otras operaciones: " + id);
        }
        System.out.println("Fin del programa");
    }

}
