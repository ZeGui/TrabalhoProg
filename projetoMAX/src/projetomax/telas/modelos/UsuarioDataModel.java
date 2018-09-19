/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomax.telas.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import projetomax.usuarios.ClienteCarnivoro;
import projetomax.usuarios.ClienteVegano;
import projetomax.usuarios.ClienteVegetariano;
import projetomax.usuarios.Nutricionista;
import projetomax.usuarios.Pessoa;


/**
 *
 * @author josel
 */
public class UsuarioDataModel extends AbstractTableModel{
    
    private ArrayList<Pessoa> usuarios;
    private String colunas[] = {"Tipo","Nome", "Descrição", "Receita"};
    
    public UsuarioDataModel(ArrayList<Pessoa> a){
        this.usuarios = a; 
    }
    
//       public void addLinha(Cliente cl){
//        this.clientes.add(cl);
//        this.fireTableDataChanged();
//    }

    @Override
    public int getRowCount() {
        return this.usuarios.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pessoa p = this.usuarios.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
            switch (columnIndex) {
            case 0:
                if (p instanceof ClienteCarnivoro){
                    return "Carnívoro";
                }else if (p instanceof ClienteVegano){
                    return "Vegano";
                }
                else if (p instanceof ClienteVegetariano){
                    return "Vegetariano";
                }else{
                    return "Nutricionista";
                }
                
            case 1:
                return p.getNome();
            case 2:
                if(p instanceof ClienteCarnivoro){
                    return ((ClienteCarnivoro) p).getDescricao();
                } else if (p instanceof ClienteVegano){
                    return ((ClienteVegano) p).getDescricao();
                }else if (p instanceof ClienteVegetariano){
                    return ((ClienteVegetariano) p).getDescricao();
                }
            case 3:
                if (p instanceof ClienteCarnivoro){
                    return ((ClienteCarnivoro) p).getReceitaMedica();
                }else if (p instanceof ClienteVegano){
                    return ((ClienteVegano) p).getReceitaMedica();
                }else if(p instanceof ClienteVegetariano){
                    return ((ClienteVegetariano) p).getReceitaMedica();
                }
            case 4:
                return p.getStatus();
                
                
                
            default:
                break;
        }
        
        
        return null;
    }
    
     @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
  
            
    
}
