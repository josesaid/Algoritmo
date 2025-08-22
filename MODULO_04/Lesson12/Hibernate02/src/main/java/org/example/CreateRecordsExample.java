package org.example;

import org.example.entity.User;
import java.util.Properties;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CreateRecordsExample {
    void createRecords(){
        try {
            initDb();

            User user = new User();
            user.setId( 1 );
            user.setName( "Brett Meyer" );
            user.setEmail( "foo@foo.com" );
            user.setPhone( "123-456-7890" );
            insertUser( user );

            user = new User();
            user.setId( 2 );
            user.setName( "Pedro picapiedra" );
            user.setEmail( "peter@flinstones.com" );
            user.setPhone( "1112131415" );
            insertUser( user );


            user = getUser( user.getId() );
            //user = getUser( 5 );
            if(user.getName() ==null){
                System.out.println("El usuario no fue encontrado en la BD");
            }else {
                System.out.println("Recovering user: " + user.getId()+" with NAME: " + user.getName());
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

    }




    /**
     * Insert user.
     *
     * @param user the user
     * @throws SQLException the SQL exception
     */
    private static void insertUser(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = connection();

            stmt = conn.prepareStatement( "INSERT INTO users VALUES(?, ?, ?, ?)" );
            stmt.setInt( 1, user.getId() );
            stmt.setString( 2, user.getName() );
            stmt.setString( 3, user.getEmail() );
            stmt.setString( 4, user.getPhone() );
            stmt.executeUpdate();
            stmt.close();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        System.out.println("User Inserted: " + user.getId()+" with name: " + user.getName());
    }



    /**
     * Gets the user.
     *
     * @param id the id
     * @return the user
     * @throws SQLException the SQL exception
     */
    private static User getUser(int id) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = connection();

            stmt = conn.prepareStatement( "SELECT id, name, email, phone FROM users WHERE id=?" );
            stmt.setInt( 1, id );
            rs = stmt.executeQuery();
            boolean resultado = rs.next();
            if(resultado){
                User user = new User();
                user.setId( rs.getInt( 1 ) );
                user.setName( rs.getString( 2 ) );
                user.setEmail( rs.getString( 3 ) );
                user.setPhone( rs.getString( 4 ) );

                rs.close();
                stmt.close();

                return user;

            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return new User();
    }

    /**
     * Connection.
     *
     * @return the connection
     * @throws SQLException the SQL exception
     * @throws ClassNotFoundException the class not found exception
     */
    static Connection connection() throws SQLException, ClassNotFoundException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "sa");

        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:db1;DB_CLOSE_DELAY=-1;MVCC=TRUE", connectionProps);
        conn.setAutoCommit( true );
        return conn;
    }

    /**
     * Inits the db.
     *
     * @throws SQLException the SQL exception
     * */

    private static void initDb() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = connection();

            stmt = conn.prepareStatement( "CREATE TABLE Users(id INT PRIMARY KEY, name VARCHAR(255), "
                    + "email VARCHAR(255), phone VARCHAR(255))" );
            stmt.executeUpdate();
            stmt.close();


            stmt = conn.prepareStatement( "CREATE TABLE Tools(id INT PRIMARY KEY, name VARCHAR(255))" );
            stmt.executeUpdate();
            stmt.close();


            stmt = conn.prepareStatement( "CREATE TABLE Skills(id INT PRIMARY KEY, name VARCHAR(255))" );
            stmt.executeUpdate();
            stmt.close();
            stmt = conn.prepareStatement( "CREATE TABLE Users_Tools(userId INT, toolId INT, "
                    + "PRIMARY KEY(userId, toolId))" );
            stmt.executeUpdate();
            stmt.close();
            stmt = conn.prepareStatement( "CREATE TABLE Users_Skills(userId INT, skillId INT, "
                    + "PRIMARY KEY(userId, skillId))" );
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

}
