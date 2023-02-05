package br.com.mobilidade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.mobilidade.conexao.Conexao;
import br.com.mobilidade.model.FormaPg;
import br.com.mobilidade.model.Usuario;

public class PagamentosDao {
	
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public boolean pgPIX(FormaPg pg, int id_user) {
        sql = "insert into tb_forma_pagamento "
        + "(forma,valor,id_usuarios) "
        + " values (?,?,?)";
        con = Conexao.conectar();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pg.getForma());
            ps.setDouble(2, pg.getValor());
            ps.setInt(3, id_user);

            ps.execute();
            con.close();
            System.out.println("PIX cadastrado com sucesso!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean pgCartao(FormaPg pg, int id_user) {
        sql = "insert into tb_forma_pagamento "
        + "(forma,valor,id_usuarios) "
        + " values (?,?,?)";
        con = Conexao.conectar();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pg.getForma());
            ps.setDouble(2, pg.getValor());
            ps.setInt(3, id_user);
            ps.execute();
            con.close();
            System.out.println("Pagamento com cartao de credito cadastrado com sucesso!");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
}
