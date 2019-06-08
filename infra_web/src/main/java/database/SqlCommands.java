package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class SqlCommands {

    private final static String DB_URL = "jdbc:sqlite:C:/Users/daniel/.dbeaver4/.metadata/sample-database-sqlite-1/Chinook.db";

    //static String rdbmsUrl;

    /*public SqlCommands(){
        rdbmsUrl = "jdbc:sqlite:C:/Users/daniel/.dbeaver4/.metadata/sample-database-sqlite-1/Chinook.db";
    }

    public SqlCommands(String rdbmsUrl){
        this.rdbmsUrl=rdbmsUrl;
    }*/


   /*enum rdbmsType {
        sqLight,
        mySql
    }*/

    public static Connection connect() {

        Connection conn = null;
        try {

            // load driver
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(DB_URL);
            } catch (SQLException e) {
            System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void createTable() throws SQLException {

        Connection conn = connect();
        String sql = "CREATE TABLE IF NOT EXISTS Transformers (\n"
                + "	Name text PRIMARY KEY,\n"
                + "	Faction text NOT NULL,\n"
                + "	Subgroup text\n"
                + ");";

        Statement stmt = conn.createStatement();
        // create a new table
        stmt.execute(sql);
    }

    public static void insert() throws SQLException {

        Connection conn = connect();

        String sql = "INSERT INTO Transformers (Name, Faction, Subgroup) \n"
                     + "VALUES ('Grimlock', 'Autobot', 'Dinobot');";

        Statement stmt = conn.createStatement();
        stmt.execute(sql);
    }

    public static List<List<String>> select(String table, String... columns) throws SQLException {

        Connection conn = connect();
        String selectSqlQuery = buildSelectQuery(table, columns);

        Statement stmt = conn.createStatement();
        ResultSet results = stmt.executeQuery(selectSqlQuery);
        return getAllDataFromResultSet(results, columns);
    }

    public static String buildSelectQuery(String table, String... columns){
        StringBuilder tempSql= new StringBuilder("SELECT");
        for(int i=0; i < columns.length; i++){
            if(i == columns.length - 1){
                tempSql.append(" "+columns[i]+" ");
            }else {
                tempSql.append(" "+columns[i]+",");
            }
        }
        //tempSql.append(" "+column1+",");
        //tempSql.append(column2+" ");
        tempSql.append("FROM "+table+";\n");
        return tempSql.toString();
    }

    public static List<List<String>> getAllDataFromResultSet(ResultSet results, String... columns) throws SQLException {
        List<List<String>> rows = new ArrayList<List<String>>();
        while (results.next()){
            List<String> rowValues = new ArrayList<String>();
            for(String column: columns){
                rowValues.add(results.getString(column));
            }
            rows.add(rowValues);
        }
        return rows;
    }
}

