package Model;

import DAO.FerramentaDAO;
import java.util.*;
import java.sql.SQLException;

public class Ferramenta {
    
    private String modelo;
    private String marca;
    private double preco;
    private int ID;
    private final FerramentaDAO dao;

    public Ferramenta() {
        this.dao = new FerramentaDAO();
    }

    public Ferramenta(String modelo, String marca, double preco, int ID) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.ID = ID;
        this.dao = new FerramentaDAO();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public ArrayList getMinhaLista(){
        return dao.getMinhaLista();
    }
    
    public boolean InsertFerramentaBD(String modelo, String marca, double preco) throws SQLException {
        int ID = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(modelo, marca, preco, ID);
        dao.InsertFerramentaBD(objeto);
        return true;
    }
    
    public boolean DeleteFerramentaBD(int ID) {
        dao.DeleteFerramentaBD(ID);
        return true;
    }
    
    public boolean UpdateFerramentaBD(String modelo, String marca, double preco, int ID) {
        Ferramenta objeto = new Ferramenta(modelo, marca, preco, ID);
        dao.UpdateFerramentaBD(objeto);
        return true;
    }
    
    public Amigo carregaFerramenta(int ID) {
        dao.carregaFerramenta(ID);
        return null;
    }
    
    public int maiorID() throws SQLException {
        return dao.maiorID();
    }

}
   
