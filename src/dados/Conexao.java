package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection conexao = null;
    //private Helpers hPers = new Helpers();
    private final String DRIVER = "org.hsqldb.jdbcDriver";
    private final String DBNAME = "oglehubversions";
    //private final String URL = "jdbc:firebirdsql:localhost/3050:C:\\PhilippeSis\\SIRHO\\bd\\" + DBNAME;
    private final String URL = "jdbc:hsqldb:file:/opt/philippesis/oglehubversions" + DBNAME;
    private final String USER = "SA";
    private final String PW = "htec2014";

    public boolean getConexao() {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USER, PW);
            return true;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não localizado!" + e);
            return false;
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar ao banco " + e);
            return false;
        }
    }//Fim classe getConexao

    public boolean closeConexao() {
        try {
            conexao.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

}
