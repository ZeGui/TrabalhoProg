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
import projetomax.usuarios.Cliente;

/**
 *
 * @author josel
 */
public class ProjetoMAX {
    private ArrayList<Pessoa> pessoaC;
    private ArrayList<Comida> alimentosC;
    private ArrayList<Ingrediente> ingredienteC;
    
    Pessoa cadastroPessoa;
    Alimento cadastroAlimento;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProjetoMAX variavel = new ProjetoMAX();
        variavel.pessoaC = new ArrayList<>();
        variavel.alimentosC = new ArrayList<>();
        int escolha = -1;
        while(escolha != 5){
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer:"
                + "\n1 - Cadatrar um novo cliente"
                + "\n2 - Cadastrar um(a) novo Nutricionista"
                + "\n3 - Mostrar clientes cadastrados"
                + "\n4 - Alterar"
                + "\n5 - Cadastrar uma comida"));
        if(escolha == 1){
            variavel.cadastraCliente();
            
        }else if(escolha == 2){
            variavel.cadastraNutricionista();
            
        }else if(escolha == 3){
            variavel.listaClientes();
            
        }else if(escolha == 4){
            int escolhaEdit = -1;
            String pesquisa = JOptionPane.showInputDialog("Digite o nome que quer buscar: ");
            String retorno = variavel.procuraCliente(pesquisa);
            escolhaEdit = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer com o nome seguinte"
                    + "\n" + retorno
                    + "\n1 - Editar nome:"
                    + "\n2 - Editar status:"
                    + "\n3 - Editar alimentos:"));
            if(escolhaEdit == 1){
                variavel.mudaNome(pesquisa, JOptionPane.showInputDialog("Digite o novo nome: "));
            }else if(escolhaEdit == 2){
                variavel.mudaStatus(pesquisa, JOptionPane.showInputDialog("Digite o novo Status: "));
            }else if(escolhaEdit == 3){
                
                
            }
            
        }
        
    }
       
        
    }
    private void cadastraCliente(){
        Cliente cadastroPessoa = new Cliente();
        Pessoa n = new Nutricionista();
        cadastroPessoa.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        cadastroPessoa.setStatus("ATIVO");
        cadastroPessoa.setDescricao(JOptionPane.showInputDialog("Digite a descrição do cliente: "));
        cadastroPessoa.setReceitaMedica(JOptionPane.showInputDialog("Receita méddica recomendada: "));
        for(Pessoa a: pessoaC){
            if(a.getNome().equalsIgnoreCase(JOptionPane.showInputDialog("Digite o nome da nutricionista"))){
                n = a;
            }else JOptionPane.showMessageDialog(null, "A nutricionista deve estar cadastrada");
        }
        cadastroPessoa.setNutricionista(n);
        pessoaC.add(cadastroPessoa);
        
    }
    
    private void cadastraNutricionista(){
        cadastroPessoa = new Nutricionista();
        cadastroPessoa.setNome(JOptionPane.showInputDialog("Digite o nome do(a) Nutricionista"));
        pessoaC.add(cadastroPessoa);
    }
    
    private void listaClientes(){
        Cliente a = new Cliente();
        for(Pessoa e : this.pessoaC){
            if(e.getClass() == a.getClass()){
                JOptionPane.showMessageDialog(null, "\nNome: " + e.getNome() + "\nStatus: " + e.getStatus());
            }
        }
    }
    
    private String procuraCliente(String nomeProcura){
        String mensagem = "";
        for(Pessoa a: pessoaC){
            if(a.getNome().equalsIgnoreCase(nomeProcura)){
                mensagem = mensagem + a.getNome() + ("\n") + a.getStatus();
                return (mensagem);
            }
        }
        return null;
    }
    
//    private Pessoa procuraNutricionista(String nomeProcura){
//        
//        }
//        return null;
//    }
    
    private void mudaNome(String nomeProcura, String novoNome){
        for(Pessoa a : pessoaC){
            if(a.getNome().equalsIgnoreCase(nomeProcura)){
                a.setNome(novoNome);
            }
        }
    }
    
    private void mudaStatus(String nomeProcura, String novoStatus){
        for(Pessoa a : pessoaC){
            if(a.getNome().equalsIgnoreCase(nomeProcura)){
                a.setStatus(novoStatus);
            }
        }
    }
    
    private void adicionaCafeManha(){
        
        
    }
    
    
    private void procuraComida(String nomeComida){
        Cliente cliente = new Cliente();
        for(Alimento a: cliente.getCafe()){
            
            JOptionPane.showMessageDialog(null, a.getNome());
            
        }
    }
    
    private void cadastrarIngredientes(){
        JOptionPane.showInputDialog("Digite o nome do ingrediente");
        
    }
}
    

