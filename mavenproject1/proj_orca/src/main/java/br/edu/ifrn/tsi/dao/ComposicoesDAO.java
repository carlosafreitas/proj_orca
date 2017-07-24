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
import java.sql.SQLException;

/**
 *
 * @author carlos
 */
public class ComposicoesDAO {
    public void salvar(Composicoes composicoes) throws SQLException{
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
        
        Connection conexao = ConexaoFactory.conectar();
        
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        comando.setString(1, composicoes.getCodigo_composicao());
        
        comando.executeUpdate();
        
    }
}
