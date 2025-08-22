package org.example;

import org.example.converters.RatingAttributeConverter;
import org.example.entity.User;
import org.example.entity.UserAddress;
import org.example.enums.Rating;

import javax.persistence.EntityManager;
import java.sql.*;
import java.util.Properties;

public class CreateRecordsExample {
    void createRecords(){
        try {
            initDb();

            User user = new User();
            user.setName( "Brett_Meyer" );
            user.setEmail( "foo@foo.com" );
            user.setPhone( "123-456-7890" );
            user.setRating(Rating.TWO);
            user.setImportantValue(user.getImportantValue());

            UserAddress userAddress = new UserAddress();
            userAddress.setCountry("MX");
            userAddress.setCity("Jalisco");
            userAddress.setStreet("Calle Zoyla Flor silvestre que marchitó el olvidó");
            userAddress.setHome("home 01");
            user.setUserAddress(userAddress);


            EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();

            /// ---------

            user = new User();
            user.setName( "Pedro_picapiedra" );
            user.setEmail( "peter@flinstones.com" );
            user.setPhone( "1112131415" );
            user.setRating(Rating.FOUR);
            user.setImportantValue(user.getImportantValue());


            userAddress = new UserAddress();
            userAddress.setCountry("USA");
            userAddress.setCity("NY");
            userAddress.setStreet("5th Av.");
            userAddress.setHome("home 02");
            user.setUserAddress(userAddress);

            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();

            user = getUser( user.getId() );

            if(user.getName() ==null){
                System.out.println("El usuario no fue encontrado en la BD");
            }else {
                System.out.println("Recovering user: " + user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

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

            stmt = conn.prepareStatement( "SELECT id, name, email, phone, rating , importantValue  "
                    + " FROM USER WHERE id=?" );
            stmt.setInt( 1, id );
            rs = stmt.executeQuery();
            boolean resultado = rs.next();
            if(resultado){
                User user = new User();
                user.setId( rs.getInt( 1 ) );
                user.setName( rs.getString( 2 ) );
                user.setEmail( rs.getString( 3 ) );
                user.setPhone( rs.getString( 4 ) );

                int rating = rs.getInt(5);
                user.setRating(new RatingAttributeConverter().convertToEntityAttribute(rating));

                user.setImportantValue(user.getImportantValue()==null?"TBD":user.getImportantValue());

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

            stmt = conn.prepareStatement( "CREATE TABLE User(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(70), "
                    + " email VARCHAR(70), phone VARCHAR(70), rating VARCHAR(50), "
                    + " importantValue VARCHAR(70), "
                    + " user_address_country VARCHAR(30), user_address_city VARCHAR(30), user_address_street VARCHAR(50),  "
                    + " user_address_home VARCHAR(50) )" );
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
