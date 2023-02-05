package br.com.mobilidade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.mobilidade.conexao.Conexao;
import br.com.mobilidade.model.TipoCartao;
import br.com.mobilidade.model.Usuario;

public class PedirPasseDao {
	
	Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public boolean pedirPasse(TipoCartao ct ,int id_usuario) {
        sql = "insert into tb_tipo_cartao "
        + "(tipo,num_identificação,id_usuarios) "
        + " values (?,?,?)";
        con = Conexao.conectar();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ct.getTipo());
            ps.setInt(2, ct.getNum_identificacao());
            ps.setInt(3, id_usuario);

            ps.execute();
            con.close();
            System.out.println("Pedido Efetuado!");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
}
