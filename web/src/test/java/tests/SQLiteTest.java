package tests;
import org.testng.annotations.Test;
import database.SqlCommands;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class SQLiteTest {
    @Test
    public void test() throws SQLException {

      List<List<String>> rows = SqlCommands.select("Album", "AlbumId", "Title");

      System.out.println("");


    }











}
