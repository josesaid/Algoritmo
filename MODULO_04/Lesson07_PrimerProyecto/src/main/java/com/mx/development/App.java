package com.mx.development;


import java.sql.ResultSet;

/**
 * Hello world!
 *
 * @author josesaidolanogarcia
 */
public class App {
    /**
     * The main method serves as the entry point of the application.
     * It initializes a database insert operation by executing a predefined insert query.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main( String[] args ) {

        /*
        System.out.println(new DatabaseInsert().insert(DatabaseConstants.queryInsert01) > 0 ?
                "Exito en insert 01":"Error en insert 01");
        System.out.println(new DatabaseInsert().insert(DatabaseConstants.queryInsert02) > 0 ?
                "Exito en insert 02":"Error en insert 02");
        */
        DatabaseQuery dbQuery = new DatabaseQuery();
        Object object = dbQuery.query(DatabaseConstants.queryInsert03);


        //Evaluamos el object, si es int entonces significa que tenemos un error
        if(object instanceof Integer){
            int numero = ((Integer)object).intValue();
            System.out.println("ERROR: " + numero);
        }
        if(object instanceof ResultSet){
            ResultSet rs = (ResultSet)object;

            try{
                System.out.println("NOMBRE:");
                while(rs.next()){
                    System.out.println(rs.getString("nombre"));
                }
            }catch(Exception e){
                System.err.println("Error al obtener los datos: " + e.getMessage());
            }
        }

        //al final:
        object = dbQuery.cierraConexion();
        if(object instanceof Integer){
            int numero = ((Integer)object).intValue();
            System.out.println(numero==0?"Exito al cerrar la conexión":"Error al cerrar la conexión");
        }
    }

}
