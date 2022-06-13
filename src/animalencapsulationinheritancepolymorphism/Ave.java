/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Ave extends Animal{
    
    private String corPena;

    @Override
    public String toString() {
        return "Dados: " + "peso= " + this.getPeso() + ", idade= " + this.getIdade() + ", membros= " + this.getMembros()+
        " ||| Ave ||| " + "corPena= " + corPena ;
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    
    
}
