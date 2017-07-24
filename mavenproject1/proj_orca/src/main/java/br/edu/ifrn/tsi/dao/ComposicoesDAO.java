/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.tsi.dao;

import br.edu.ifrn.tsi.domain.Composicoes;
import br.edu.ifrn.tsi.factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ComposicoesDAO {
    
    public void salvarComposicoes(Composicoes composicoes) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Composicoes ");
        sql.append("private int id;\n" +
"    private String classe;\n" +
"    private int agrupador;\n" +
"    private String descricao_agrupador;\n" +
"    private String codigo_composicao;\n" +
"    private String descricao_composicao;\n" +
"    private float unidade;\n" +
"    private float custo_mao_obra;\n" +
"    private float mao_obra;\n" +
"    private float custo_material;\n" +
"    private float material;\n" +
"    private float custo_equipamento;\n" +
"    private float equipamento;\n" +
"    private float custo_servicos_terceiros;\n" +
"    private float servicos_terceiros;\n" +
"    private float custo_outros;\n" +
"    private float outros; ");
        
        
        //TODO Completar o DAO com o conteudo da tabela "Composicoes e testar o metodo 
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setString(1, composicoes.getCodigo_composicao());
        
        comando.executeUpdate();
        
    }
    
    public void excluirComposicoes(Composicoes composicoes) throws SQLException{
        StringBuilder sql = new  StringBuilder();
        sql.append("DELETE FROM Composicoes ");
        sql.append("WHERE  id = ? ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setInt(1, composicoes.getId());
        
        comando.executeUpdate();
        
    }
    
    public void editarComposicoes(Composicoes composicoes) throws SQLException{
        StringBuilder sql = new  StringBuilder();
        sql.append("UPDATE Composicoes ");
        sql.append("SET descricao = ? ");
        //
        //
        //
        sql.append("WHERE  id = ? ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setInt(1, composicoes.getId());
        comando.setInt(1, composicoes.getAgrupador());
        
        comando.executeUpdate();
    }
    
    public Composicoes pesquisarComposicoesPorId(Composicoes composicoes) throws SQLException {
        StringBuilder sql = new  StringBuilder();
        sql.append("SELECT descricao_agrupador, codigo_composicao ");
        sql.append("FROM Composicoes ");
        sql.append("WHERE id = ? ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setInt(1, composicoes.getId());
        
        
        ResultSet resultado = comando.executeQuery();
        
        Composicoes retorno = null;
        
        if (resultado.next()){
            retorno = new Composicoes();
            retorno.setId(resultado.getInt("id"));
            retorno.setCodigo_composicao(resultado.getString("codigo_composicao"));
        }
        return retorno;
    }
    
    
    public ArrayList<Composicoes> listarTodasComposicoes(Composicoes composicoes) throws SQLException {
        StringBuilder sql = new  StringBuilder();
        sql.append("SELECT descricao_agrupador, codigo_composicao ");
        sql.append("FROM Composicoes ");
        sql.append("ORDER BY descricao_agrupador ASC ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        
        // TODO  consertar o campo de pesquisa 
        comando.setString(1, "%" + composicoes.getAgrupador() + "%" );
        
        ResultSet resultado = comando.executeQuery();
        
        ArrayList<Composicoes> lista = new ArrayList<Composicoes>();
        
        while (resultado.next()){
            Composicoes item = new Composicoes();
            item.setId(resultado.getInt("id"));
            item.setCodigo_composicao(resultado.getString("codigo_composicao"));
            
            lista.add(item);
        }
        return lista;
    }
    
    public ArrayList<Composicoes> listarComposicoesDescricao() throws SQLException {
        StringBuilder sql = new  StringBuilder();
        sql.append("SELECT descricao_agrupador, codigo_composicao ");
        sql.append("FROM Composicoes ");
        sql.append("WHERE Composicoes LIKE ? ");
        sql.append("ORDER BY descricao_agrupador ASC ");
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        
        ResultSet resultado = comando.executeQuery();
        
        ArrayList<Composicoes> lista = new ArrayList<Composicoes>();
        
        while (resultado.next()){
            Composicoes retorno = new Composicoes();
            retorno.setId(resultado.getInt("id"));
            retorno.setCodigo_composicao(resultado.getString("codigo_composicao"));
            
            lista.add(retorno);
        }
        return lista;
    }
    
}
