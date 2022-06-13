/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class AnimalEncapsulationInheritancePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Mamifero m = new Mamifero();
        m.setIdade(5);
        m.setMembros(4);
        m.setPeso(12.3f);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println(m.toString()); */
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Arara ara = new Arara();
        
        c.locomover();

        ca.emitirSom();
        System.out.println(ca.toString());
    }

}
