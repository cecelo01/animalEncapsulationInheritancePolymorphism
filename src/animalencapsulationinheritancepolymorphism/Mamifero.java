/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Mamifero extends Animal{
    
    private String corPelo;

    @Override
    public String toString() {
        return "Dados: " + "peso= " + this.getPeso() + ", idade= " + this.getIdade() + ", membros= " + this.getMembros() +
        " ||| Mamifero ||| " + "corPelo= " + corPelo;
    }
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
    
    
 
