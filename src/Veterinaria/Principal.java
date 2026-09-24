package Veterinaria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Wuba
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("1111111", "Ronaldo", "7777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 25.5, cliente1);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);    
        
        mascota1.mostrarResumen();
        System.out.println("Dueño: " +mascota1.getDuenio().getNombre());
        System.out.println("------------------");
        mascota2.mostrarResumen();
    }
    
}
