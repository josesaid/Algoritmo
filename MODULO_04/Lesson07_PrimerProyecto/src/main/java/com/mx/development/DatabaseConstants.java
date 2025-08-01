package com.mx.development;

/**
 * @author josesaidolanogarcia
 */
public final class DatabaseConstants {
    public static final String MYSQL_DATABASE_URL = "jdbc:mysql://localhost:3307/algoritmo";
    public static final String MYSQL_DATABASE_USER = "root";
    public static final String MYSQL_DATABASE_PASSWORD = "algoritmo123";

    public static final int MYSQL_CLOSURE_CONNECTION_SUCCESSFUL = 0;

    public static final int ERROR_CREAR_MYSQL_CONEXION = -1;
    public static final int ERROR_MYSQL_CONEXION_ES_NULA = -2;
    public static final int ERROR_MYSQL_INSERCION = -3;
    public static final int ERROR_MYSQL_CERRANDO_CONEXION = -4;


    public static final String queryInsert01 =
            "INSERT INTO empleados (nombre, apellidoPaterno, apellidoMaterno, email) "+
            " VALUES ('Daleyma', 'Quispe', 'Calle', 'daleyma@codegym.com')";



    public static final String queryInsert02 = "INSERT INTO empleados (nombre, apellidoPaterno, apellidoMaterno, email) VALUES\n" +
            "  ('Juan', 'Pérez', 'Gómez', 'juan.perez@example.com'),\n" +
            "  ('María', 'López', 'Rodríguez', 'maria.lopez@example.com'),\n" +
            "  ('Carlos', 'González', 'Fernández', 'carlos.gonzalez@example.com'),\n" +
            "  ('Ana', 'Martínez', 'Sánchez', 'ana.martinez@example.com'),\n" +
            "  ('Luis', 'Ramírez', 'Díaz', 'luis.ramirez@example.com'),\n" +
            "  ('Sofía', 'Torres', 'Vargas', 'sofia.torres@example.com'),\n" +
            "  ('Pedro', 'Flores', 'Herrera', 'pedro.flores@example.com'),\n" +
            "  ('Laura', 'Gutiérrez', 'Ruiz', 'laura.gutierrez@example.com'),\n" +
            "  ('Diego', 'Cruz', 'Mendoza', 'diego.cruz@example.com'),\n" +
            "  ('Elena', 'Reyes', 'Castillo', 'elena.reyes@example.com');\n";

    public static final String queryInsert03 = "SELECT * FROM empleados";


}
