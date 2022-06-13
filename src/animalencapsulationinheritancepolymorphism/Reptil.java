/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Reptil extends Animal{
    
    private String corEscama;

    @Override
    public String toString() {
       return "Dados: " + "peso= " + this.getPeso() + ", idade= " + this.getIdade() + ", membros= " + this.getMembros()+
       " ||| Reptil ||| " + "corEscama=" + corEscama + '}';
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
}
