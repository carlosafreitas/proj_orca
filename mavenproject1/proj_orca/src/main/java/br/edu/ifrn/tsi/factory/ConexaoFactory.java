/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.tsi.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class ConexaoFactory {
    private static final String USUARIO = "root";
    private static final String SENHA = "megasena";
    private static final String URL = "jdbc:mysql://localhost:3306/orca?useSSL=false&useTimezone=true&serverTimezone=UTC";
    
    public static Connection conectar() throws SQLException{
        Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        return conexao;
    }
    
    public static void main(String[] args) {
        try {
            Connection conexao = ConexaoFactory.conectar();
            System.out.println("Conetou !!!!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
