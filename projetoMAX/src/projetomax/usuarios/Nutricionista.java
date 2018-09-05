/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomax.usuarios;

/**
 *
 * @author josel
 */
public class Nutricionista extends Pessoa implements IPrioridade{
    @Override
    public void statusNutricionista(){
        this.setStatus("NUTRICIONISTA");
    }
    
}
