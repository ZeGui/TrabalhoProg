/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomax.telas.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import projetomax.alimento.Alimento;

/**
 *
 * @author josel
 */
public class ComidaDataModel extends AbstractTableModel{
    private ArrayList<Alimento> comidas;
    private String colunas[] = {"Tipo", "Nome", "Fibras"};
    
    public ComidaDataModel(ArrayList<Alimento> a){
        this.comidas = a; 
    }
    
//       public void addLinha(Cliente cl){
//        this.clientes.add(cl);
//        this.fireTableDataChanged();
//    }

    @Override
    public int getRowCount() {
        return this.comidas.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alimento a = this.comidas.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
            switch (columnIndex) {
            case 0:
                return a.getTipo();
            case 1:
                return a.getNome();
            case 2:
                
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
