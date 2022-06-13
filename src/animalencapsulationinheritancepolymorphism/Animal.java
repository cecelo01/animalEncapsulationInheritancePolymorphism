 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public abstract class Animal {
    
    private float peso;
    private int idade, membros;

    @Override
    public String toString() {
        return "Dados: " + "peso= " + peso + ", idade= " + idade + ", membros= " + membros;
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
