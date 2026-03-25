package DAO;

import Model.Amigo;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AmigoDAO {

    public static ArrayList<Amigo> MinhaLista = new ArrayList<Amigo>();

    public AmigoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("select max(ID) ID from tb_amigo");
            res.next();
            maiorID = res.getInt("ID");

            stmt.close();
        } catch (SQLException ex) {
        }
        return maiorID;
    }

    public Connection getConexao() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "db_aluguelferramentas";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Sacul122@DB";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Servidor conectado");
            } else {
                System.out.println("Servidor não conectado");
            }

            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado" + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            return null;
        }

    }

    public ArrayList getMinhaLista() {

        MinhaLista.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("select*from tb_amigo");
            while (res.next()) {

                String nome = res.getString("nome");
                String nmrtelefone = res.getString("nmrtelefone");
                int ID = res.getInt("ID");

                Amigo objeto = new Amigo(nome, nmrtelefone, ID);

                MinhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertAmigoBD(Amigo objeto) {
        String sql = "insert into tb_amigo(id,nome,nmrtelefone) values(?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getNmrtelefone());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public boolean DeleteAmigoBD(int ID) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("delete from tb_amigo where ID = " + ID);
            stmt.close();
        } catch (SQLException erro) {
        }
        return true;
    }

    public boolean UpdateAmigoBD(Amigo objeto) {

        String sql = "UPDATE tb_amigo set nome = ? ,nmrtelefone = ? WHERE ID = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getNmrtelefone());
            stmt.setInt(3, objeto.getID());

            stmt.execute();
            stmt.close();

            return true;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public Amigo carregaAmigo(int ID) {

        Amigo objeto = new Amigo();
        objeto.setID(ID);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("select * from tb_amigo where ID = " + ID);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setNmrtelefone(res.getString("nmrtelefone"));

            stmt.close();
        } catch (SQLException erro) {
        }
        return objeto;
    }

}
