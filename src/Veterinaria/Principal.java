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
        
        cliente1.setIdentificacion("222222");
        System.out.println("Dueño: " + mascota1.getDuenio().getIdentificacion());
        
        Veterinario veterinario1 = new Veterinario("V001", "Medicina General", "Dra Shirley Cruz");
        
        Consulta consulta1 = new Consulta(
                "5/10/2024", 
                "Consulta General", 
                mascota1,
                15000,
                veterinario1);
        consulta1.mostrarResumen();
        consulta1.actualizarcosto(17500);
        consulta1.mostrarResumen();
        consulta1.actualizarcosto(16000, "Control y medicamento");
        consulta1.mostrarResumen();
        
        Cliente cliente2 = new Cliente ("2222222222", "Carlos Mora", "88888888");
        Persona personaReferencia = cliente2;
        
        System.out.println(cliente2.getNombre());
        System.out.println(personaReferencia.getNombre());
        
    }
    
}
