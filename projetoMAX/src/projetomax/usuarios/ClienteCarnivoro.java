/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomax.usuarios;

import java.util.ArrayList;
import projetomax.alimento.Alimento;

/**
 *
 * @author josel
 */
public class ClienteCarnivoro extends Pessoa{
    private String descricao;
    private String receitaMedica;
    private Pessoa nutricionista;
    private ArrayList<Alimento> cafe = new ArrayList<>();
    private ArrayList<Alimento> lanche = new ArrayList<>();
    private ArrayList<Alimento> almoco = new ArrayList<>();
    private ArrayList<Alimento> cafeTarde = new ArrayList<>();
    private ArrayList<Alimento> janta = new ArrayList<>();
    private ArrayList<Alimento> cafeNoite = new ArrayList<>();

    public ClienteCarnivoro(){
        
    }
    public ClienteCarnivoro(String descricao, String receitaMedica, Pessoa nutricionista){
        this.descricao = descricao;
        this.receitaMedica = receitaMedica;
        this.nutricionista = nutricionista;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReceitaMedica() {
        return receitaMedica;
    }

    public void setReceitaMedica(String receitaMedica) {
        this.receitaMedica = receitaMedica;
    }

    public Pessoa getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Pessoa nutricionista) {
        this.nutricionista = nutricionista;
    }

    public ArrayList<Alimento> getCafe() {
        return cafe;
    }

    public void setCafe(ArrayList<Alimento> cafe) {
        this.cafe = cafe;
    }

    public ArrayList<Alimento> getLanche() {
        return lanche;
    }

    public void setLanche(ArrayList<Alimento> lanche) {
        this.lanche = lanche;
    }

    public ArrayList<Alimento> getAlmoco() {
        return almoco;
    }

    public void setAlmoco(ArrayList<Alimento> almoco) {
        this.almoco = almoco;
    }

    public ArrayList<Alimento> getCafeTarde() {
        return cafeTarde;
    }

    public void setCafeTarde(ArrayList<Alimento> cafeTarde) {
        this.cafeTarde = cafeTarde;
    }

    public ArrayList<Alimento> getJanta() {
        return janta;
    }

    public void setJanta(ArrayList<Alimento> janta) {
        this.janta = janta;
    }

    public ArrayList<Alimento> getCafeNoite() {
        return cafeNoite;
    }

    public void setCafeNoite(ArrayList<Alimento> cafeNoite) {
        this.cafeNoite = cafeNoite;
    }
    
  
    
    
}

