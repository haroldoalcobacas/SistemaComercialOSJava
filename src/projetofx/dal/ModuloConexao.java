/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofx.dal;
// precisa importar modulo >>>>>>>>>>>>>>>>>>>>>>>>
import java.sql.*;


/**
 *
 * @author HAROLDO
 */
public class ModuloConexao {
    // metodo responsável por estabelecer a conexão com o banco>>>>>>>>
    public static Connection conector(){
        java.sql.Connection conexao =null;
        // alinha abaixo chama o drive        
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando iformações referente ao banco
        // para mudar para um servidor hospedado altere o 'localhost' pelo IP
        String url="jdbc:mysql://localhost:3306/dbinfox";
        String user= "root";
        String passoword = "admin250307";
        //estabelecendo a conexao com o banco
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,passoword);
            return conexao;
        }catch (Exception e){
            // imprimir o erro
            //System.out.println(e);
            return null;
        }
                
        
    }
}
