package com.mx.development;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static com.mx.development.DatabaseConstants.*;

/**
 * The DatabaseInsert class provides functionality to insert records into a database.
 * It handles database connection, query execution, and error handling during the process.
 * @author josesaidolanogarcia
 */
public class DatabaseInsert {
    private Connection connection = null;
    private Statement statement = null;
    int filasInsertadas = -100;

    public int insert(String query){
        try{
            System.out.println("Intentando conectarnos a la BD...");
            connection = DriverManager.getConnection(MYSQL_DATABASE_URL, MYSQL_DATABASE_USER, MYSQL_DATABASE_PASSWORD);
        }catch(SQLException e){
            System.err.println("Error al crear la conexión a la BD: " + e.getMessage());
            return ERROR_CREAR_MYSQL_CONEXION;
        }
        try{
            if(connection != null){
                statement = connection.createStatement();
            }else{
                System.err.println("Error debido a que la conexión es nula.");
                return ERROR_MYSQL_CONEXION_ES_NULA;
            }
        } catch (SQLException e) {
            System.err.println("Error debido a que la conexión es nula.");
            return ERROR_MYSQL_CONEXION_ES_NULA;
        }
        try{
            filasInsertadas  = statement.executeUpdate(query);
            System.out.println("Registro(s) Insertado(s) exitosamente: " + filasInsertadas);
        } catch (SQLException e) {
            System.err.println("Error al insertar el empleado: " + e.getMessage());
            return ERROR_MYSQL_INSERCION;
        }
        try{
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error al intentar cerrar la conexión");
            return ERROR_MYSQL_CERRANDO_CONEXION;
        }
        return filasInsertadas;
    }

}
