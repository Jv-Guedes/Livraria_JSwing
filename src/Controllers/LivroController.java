/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Livro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Red-Dragon
 */
public class LivroController implements ActionListener{

    private JTextField autorTextField,tituloTextField;
    private JComboBox anoComboBox,generoComboBox;
    private Livro livro;

    public LivroController(JTextField autorTextField, JTextField tituloTextField) {
        this.autorTextField = autorTextField;
        this.tituloTextField = tituloTextField;
    }

    public LivroController(JComboBox anoComboBox, JComboBox generoComboBox) {
        this.anoComboBox = anoComboBox;
        this.generoComboBox = generoComboBox;
    }

    public LivroController(JTextField tituloTextField) {
        
    }

  
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        
       switch(event.getActionCommand()){
          case "Cadastrar": this.cadastrarLivro();
          break;
          /*case "Limpar": this.limparFormulario();
          break;
          case "Exibir": this.exibirFuncionario();
          break;*/
      }
       System.out.println(event.getActionCommand());
    }
    public void cadastrarLivro(){
        System.out.println("Cadastrar");
    }
}
