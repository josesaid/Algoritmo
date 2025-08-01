package com.mx.development;

import java.sql.*;

import static com.mx.development.DatabaseConstants.*;

public class DatabaseQuery {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    //int filasInsertadas = -100;

    public Object query(String query){
        System.out.println("ENTRO a consultar");
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
            resultSet  = statement.executeQuery(query);
            /*ResultSet rs = resultSet;
            int rowCount = 0;

            while (rs.next()) {
                rowCount++;
            }
            System.out.println("Registro(s) obtenidos(s) exitosamente: " + rowCount);*/
        } catch (SQLException e) {
            System.err.println("Error al insertar el empleado: " + e.getMessage());
            return ERROR_MYSQL_INSERCION;
        }

        System.out.println("SALIO DE consultar");
        return resultSet;
    }

    public int cierraConexion() {
        try{
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error al intentar cerrar la conexión");
            return ERROR_MYSQL_CERRANDO_CONEXION;
        }
        return MYSQL_CLOSURE_CONNECTION_SUCCESSFUL;
    }

}
