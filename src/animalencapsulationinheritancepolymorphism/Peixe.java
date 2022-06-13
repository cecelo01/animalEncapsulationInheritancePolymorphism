/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Peixe extends Animal {

    private String corEscama;

    @Override
    public String toString() {
        return "Dados: " + "peso= " + this.getPeso() + ", idade= " + this.getIdade() + ", membros= " + this.getMembros()+
        " ||| Peixe ||| " + "corEscama= " + corEscama;
    }

    public void soltarBolha() {
        System.out.println("Solou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
