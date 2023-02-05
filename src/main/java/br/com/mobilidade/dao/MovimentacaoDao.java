package br.com.mobilidade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.mobilidade.conexao.Conexao;
import br.com.mobilidade.model.FormaPg;
import br.com.mobilidade.model.Movimentacao;
import br.com.mobilidade.model.Usuario;

public class MovimentacaoDao {
	
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
	public boolean novaMovimentacao(Movimentacao m, int id_user) {
        sql = "insert into tb_cartao_movimento "
        + "(tipo,valor,descricao,id_usuarios) "
        + " values (?,?,?,?)";
        con = Conexao.conectar();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getTipo());
            ps.setDouble(2, m.getValor());
            ps.setString(3, m.getDescricao());
            ps.setInt(4, id_user);
            ps.execute();
            con.close();
            System.out.println("Movimentação Cadastrada");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
	
	 public ArrayList<Movimentacao> pesquisar(int id) {
	        ArrayList<Movimentacao> listaMovim = new ArrayList<Movimentacao>();
	        try {
	        	con = Conexao.conectar();
	            String query = "SELECT descricao  FROM tb_cartao_movimento where id_usuarios=?";
	            ps = con.prepareStatement(query);
	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();
	            Movimentacao movi;
	            while (rs.next()) {
	            	movi = new Movimentacao();
	            	movi.setDescricao(rs.getString("descricao"));

	            	
	                listaMovim.add(movi);
	            }
	    
	        } catch (Exception e) {
	            System.out.println("Erro " + e.getMessage());
	        }
	        return listaMovim;
	    }
	
}
