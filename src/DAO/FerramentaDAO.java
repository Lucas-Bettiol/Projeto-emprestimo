package DAO;

import Model.Ferramenta;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FerramentaDAO {

    public static ArrayList<Ferramenta> MinhaLista = new ArrayList<Ferramenta>();

    public FerramentaDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("select max(ID) ID from tb_ferramenta");
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
            ResultSet res = stmt.executeQuery("select*from tb_ferramenta");
            while (res.next()) {

                String modelo = res.getString("modelo");
                String marca = res.getString("marca");
                double preco = res.getDouble("preco");
                int ID = res.getInt("ID");

                Ferramenta objeto = new Ferramenta(modelo, marca, preco, ID);

                MinhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertFerramentaBD(Ferramenta objeto) {
        String sql = "insert into tb_ferramenta(id,modelo,marca,preco) values(?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getID());
            stmt.setString(2, objeto.getModelo());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getPreco());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public boolean DeleteFerramentaBD(int ID) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("delete from tb_Ferramenta where ID = " + ID);
            stmt.close();
        } catch (SQLException erro) {
        }
        return true;
    }
    
    public boolean UpdateFerramentaBD(Ferramenta objeto) {

        String sql = "UPDATE tb_Ferramenta set modelo = ? ,marca = ?, preco = ? WHERE ID = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getModelo());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getPreco());
            stmt.setInt(4, objeto.getID());

            stmt.execute();
            stmt.close();

            return true;
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public Ferramenta carregaFerramenta(int ID) {

        Ferramenta objeto = new Ferramenta();
        objeto.setID(ID);

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("select * from tb_ferramenta where ID = " + ID);
            res.next();

            objeto.setModelo(res.getString("modelo"));
            objeto.setMarca(res.getString("marca"));
            objeto.setPreco(res.getDouble("preco"));

            stmt.close();
        } catch (SQLException erro) {
        }
        return objeto;
    }

}
