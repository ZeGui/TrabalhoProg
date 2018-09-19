/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomax.alimento;

/**
 *
 * @author josel
 */
public class Ingrediente extends Alimento{
    private String porcao;
    private double valorEnergetico;
    private double carboidratos;
    private double proteinas;
    private double gordurasTotais;
    private double gordurasSaturadas;
    private double gordurasTrans;
    private double fibraAlimentar;
    private double sodios;

    public String getPorcao() {
        return porcao;
    }

    public void setPorcao(String porcao) {
        this.porcao = porcao;
    }

    public double getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(double valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(double gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public double getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public void setGordurasSaturadas(double gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public double getGordurasTrans() {
        return gordurasTrans;
    }

    public void setGordurasTrans(double gordurasTrans) {
        this.gordurasTrans = gordurasTrans;
    }

    public double getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(double fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public double getSodios() {
        return sodios;
    }

    public void setSodios(double sodios) {
        this.sodios = sodios;
    }
    
    
    
}
