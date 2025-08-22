package org.example;


import org.example.entity.Skill;
import org.example.entity.Tool;
import org.example.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



public class Main {
    public static void main(String[] args) {
        try {
            initDb();

            Tool tool = new Tool();
            tool.setId( 1 );
            tool.setName( "Hammer" );
            insertTool( tool );
            List<Tool> tools = new ArrayList<Tool>();
            tools.add( tool );

            Skill skill = new Skill();
            skill.setId( 1 );
            skill.setName( "Hammering Things" );
            insertSkill( skill );
            List<Skill> skills = new ArrayList<Skill>();
            skills.add( skill );

            User user = new User();
            user.setId( 1 );
            user.setName( "Brett Meyer" );
            user.setEmail( "foo@foo.com" );
            user.setPhone( "123-456-7890" );
            user.setTools( tools );
            user.setSkills( skills );

            insertUser( user );

            System.out.println();

            user = getUser( user.getId() );
            //user = getUser( 5 );
            if(user.getName() ==null){
                System.out.println("El usuario no fue encontrado en la BD");
            }else {
                System.out.println("Recovering user: " + user.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
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

            for (Tool tool : user.getTools()) {
                stmt = conn.prepareStatement( "INSERT INTO users_tools VALUES(?, ?)" );
                stmt.setInt( 1, user.getId() );
                stmt.setInt( 2, tool.getId() );
                stmt.executeUpdate();
                stmt.close();
            }

            for (Skill skill : user.getSkills()) {
                stmt = conn.prepareStatement( "INSERT INTO users_skills VALUES(?, ?)" );
                stmt.setInt( 1, user.getId() );
                stmt.setInt( 2, skill.getId() );
                stmt.executeUpdate();
            }
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
        System.out.println("User Inserted: " + user);
    }

    /**
     * Insert tool.
     *
     * @param tool the tool
     * @throws SQLException the SQL exception
     */
    private static void insertTool(Tool tool) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = connection();

            stmt = conn.prepareStatement( "INSERT INTO tools VALUES(?, ?)" );
            stmt.setInt( 1, tool.getId() );
            stmt.setString( 2, tool.getName() );
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

    /**
     * Insert skill.
     *
     * @param skill the skill
     * @throws SQLException the SQL exception
     */
    private static void insertSkill(Skill skill) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = connection();

            stmt = conn.prepareStatement( "INSERT INTO skills VALUES(?, ?)" );
            stmt.setInt( 1, skill.getId() );
            stmt.setString( 2, skill.getName() );
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

                user.setTools( new ArrayList<Tool>() );
                user.setSkills( new ArrayList<Skill>() );

                stmt = conn.prepareStatement( "SELECT tools.id, tools.name FROM tools, users_tools "
                        + "WHERE users_tools.userId=? AND users_tools.toolId=tools.id" );
                stmt.setInt( 1, id );
                rs = stmt.executeQuery();
                while(rs.next()) {
                    Tool tool = new Tool();
                    tool.setId( rs.getInt( 1 ) );
                    tool.setName( rs.getString( 2 ) );
                    user.getTools().add( tool );
                }
                rs.close();
                stmt.close();

                stmt = conn.prepareStatement( "SELECT skills.id, skills.name FROM skills, users_skills "
                        + "WHERE users_skills.userId=? AND users_skills.skillId=skills.id" );
                stmt.setInt( 1, id );
                rs = stmt.executeQuery();
                while(rs.next()) {
                    Skill skill = new Skill();
                    skill.setId( rs.getInt( 1 ) );
                    skill.setName( rs.getString( 2 ) );
                    user.getSkills().add( skill );
                }

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
    private static Connection connection() throws SQLException, ClassNotFoundException {
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
     */
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