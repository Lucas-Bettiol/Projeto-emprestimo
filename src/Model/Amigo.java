package Model;

import DAO.AmigoDAO;
import java.util.*;
import java.sql.SQLException;

public class Amigo {

    private String nome;
    private String nmrtelefone;
    private int ID;
    private final AmigoDAO dao;

    public Amigo() {
        this.dao = new AmigoDAO();
    }

    public Amigo(String nome, String nmrtelefone, int ID) {
        this.nome = nome;
        this.nmrtelefone = nmrtelefone;
        this.ID = ID;
        this.dao = new AmigoDAO();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNmrtelefone() {
        return nmrtelefone;
    }

    public void setNmrtelefone(String nmrtelefone) {
        this.nmrtelefone = nmrtelefone;
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

    public boolean InsertAmigoBD(String nome, String nmrtelefone) throws SQLException {
        int ID = this.maiorID() + 1;
        Amigo objeto = new Amigo(nome, nmrtelefone, ID);
        dao.InsertAmigoBD(objeto);
        return true;
    }

    public boolean DeleteAmigoBD(int ID) {
        dao.DeleteAmigoBD(ID);
        return true;
    }

    public boolean UpdateAmigoBD(String nome, String nmrtelefone, int ID) {
        Amigo objeto = new Amigo(nome, nmrtelefone, ID);
        dao.UpdateAmigoBD(objeto);
        return true;
    }

    public Amigo carregaAmigo(int ID) {
        dao.carregaAmigo(ID);
        return null;
    }

    public int maiorID() throws SQLException {
        return dao.maiorID();
    }
    

}
