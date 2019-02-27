package br.senai.sc.sisloj;

import br.senai.sc.sisloj.dao.ClienteDao;
import br.senai.sc.sisloj.modelo.Cliente;
import br.senai.sc.sisloj.views.CadastroCliente;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;

public class SisLoj {

    public static void main(String[] args) throws SQLException {
     JFrame frame = new JFrame ("Cadastro de Cliente");
        CadastroCliente cadCli = new CadastroCliente();
        
        frame.setSize(600, 450);
        frame.add(cadCli);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    } 
    
}