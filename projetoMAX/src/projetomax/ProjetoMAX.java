/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomax;

import javax.swing.JFrame;
import projetomax.usuarios.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetomax.alimento.Alimento;
import projetomax.alimento.Comida;
import projetomax.alimento.Ingrediente;

import projetomax.usuarios.Nutricionista;

import projetomax.telas.menuEscolha;
import projetomax.usuarios.ClienteCarnivoro;
import projetomax.usuarios.ClienteVegano;
import projetomax.usuarios.ClienteVegetariano;

/**
 *
 * @author josel
 */
public class ProjetoMAX {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuEscolha menu = new menuEscolha();
        menu.setVisible(true);
        
//        ProjetoMAX variavel = new ProjetoMAX();
//        variavel.pessoaC = new ArrayList<>();
//        variavel.alimentosC = new ArrayList<>();
//        int escolha = -1;
//        while(escolha != 5){
//        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer:"
//                + "\n1 - Cadatrar um novo cliente"
//                + "\n2 - Cadastrar um(a) novo Nutricionista"
//                + "\n3 - Mostrar clientes cadastrados"
//                + "\n4 - Alterar"
//                + "\n5 - Cadastrar uma comida"));
//        if(escolha == 1){
//            if(variavel.pessoaC.size() == 0) JOptionPane.showMessageDialog(null, "Lista vazia");
//            int tem = 0;
//            for(Pessoa a: variavel.pessoaC){
//                
//                if(a instanceof Nutricionista){
//                    
//                    tem = 1;
//                }
//            }
//            if(tem == 0) JOptionPane.showMessageDialog(null, "Não possui Nutricionista cadastrada");
//            
//        }else if(escolha == 2){
//            variavel.cadastraNutricionista();
//            
//        }else if(escolha == 3){
//            variavel.listaClientes();
//            
//        }else if(escolha == 4){
//            int escolhaEdit = -1;
//            String pesquisa = JOptionPane.showInputDialog("Digite o nome que quer buscar: ");
//            String retorno = variavel.procuraCliente(pesquisa);
//            escolhaEdit = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer com o nome seguinte"
//                    + "\n" + retorno
//                    + "\n1 - Editar nome:"
//                    + "\n2 - Editar status:"
//                    + "\n3 - Editar alimentos:"));
//            if(escolhaEdit == 1){
//                variavel.mudaNome(pesquisa, JOptionPane.showInputDialog("Digite o novo nome: "));
//            }else if(escolhaEdit == 2){
//                variavel.mudaStatus(pesquisa, JOptionPane.showInputDialog("Digite o novo Status: "));
//            }else if(escolhaEdit == 3){
//                
//                
//            }
            
        
        
    
       
        
    }

    

    
//    public ArrayList<Pessoa> getLista(){
//        return pessoaC;
//        
//    }
    
//    public Cliente listaClientes(){
//        for(Pessoa e : this.pessoaC){
//            if(e instanceof Cliente){
//                
//                return ((Cliente) e);
//            }
//        }
//        return null;
//    }
    
//    public String procuraCliente(){
//        String mensagem = "";
//        for(Pessoa a: this.pessoaC){
//            mensagem = mensagem + a.getNome() + ("\n") + a.getStatus();    
//        }
//        return (mensagem);
//    }
    
//    private Pessoa procuraNutricionista(String nomeProcura){
//        
//        }
//        return null;
//    }
    
//    private void mudaNome(String nomeProcura, String novoNome){
//        for(Pessoa a : pessoaC){
//            if(a.getNome().equalsIgnoreCase(nomeProcura)){
//                a.setNome(novoNome);
//            }
//        }
//    }
    
//    private void mudaStatus(String nomeProcura, String novoStatus){
//        for(Pessoa a : pessoaC){
//            if(a.getNome().equalsIgnoreCase(nomeProcura)){
//                a.setStatus(novoStatus);
//            }
//        }
//    }
    
    private void adicionaCafeManha(){
        
        
    }
    
    

//    
//    public ArrayList getListaPessoa(){
//        return pessoaC;
//    }
    
    private void cadastrarIngredientes(){
        JOptionPane.showInputDialog("Digite o nome do ingrediente");
        
    }
}
    

