package Veterinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        Cliente cliente1 = new Cliente("1111111", "Ronaldo", "7777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 25.5, cliente1);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);

        mascota1.mostrarResumen();
        System.out.println("Dueño: " + mascota1.getDuenio().getNombre());
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

        Cliente cliente2 = new Cliente("2222222222", "Carlos Mora", "88888888");
        Persona personaReferencia = cliente2;

        System.out.println(cliente2.getNombre());
        System.out.println(personaReferencia.getNombre());

        Resumible r1 = cliente1;
        Resumible r2 = mascota1;
        Resumible r3 = consulta1;

        r1.mostrarResumen();
        r2.mostrarResumen();
        r3.mostrarResumen();

        System.out.println("Array List Mascotas");
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(new Mascota("Luffy", "Perro", 1, 1));

        if (!mascotas.isEmpty()) {
            System.out.println("Primera");
            Mascota primera = mascotas.get(0);
            primera.mostrarResumen();

        }

        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).mostrarResumen();

        }

        System.out.println("Array Mascota");
        Mascota[] mascotas1 = new Mascota[3];
        mascotas1[2] = mascota2;
        mascotas1[1] = mascota1;
        mascotas1[0] = new Mascota("Luffy", "Perro", 1, 1);
        if (mascotas1.length > 0) {
            System.out.println("Primera");
            Mascota primera = mascotas1[0];
            primera.mostrarResumen();
        }

        System.out.println("Recorre array");
        for (int i = 0; i < mascotas1.length; i++) {
            mascotas1[1].mostrarResumen();

        }

        System.out.println("=========== Repositorios==============");

        Repositorio<Mascota> repoMascotas = new Repositorio<Mascota>();
        Repositorio<Consulta> repoConsulta = new Repositorio<Consulta>();

        repoMascotas.agregar(mascota1);
        repoMascotas.agregar(mascota2);
        repoMascotas.agregar(new Mascota("Luffy", "perro", 1, 1));
        repoConsulta.agregar(consulta1);

        System.out.println(repoMascotas.contar());
        System.out.println(repoConsulta.contar());

        repoMascotas.listar();
        Utilidades.mostrarTodos(mascotas);
        Utilidades.mostrarTodos(repoMascotas.obtenerTodos());

        System.out.println("Comparando mascotas 1 y 2");
        int resultadoComparacion = mascota1.compareTo(mascota2);
        if (resultadoComparacion>0) {
            System.out.println("Mascota 1 pesa mas");
        }else if(resultadoComparacion < 0){
            System.out.println("Mascota 2 pesa mas");
        }else{
            System.out.println("Pesan igual");
        }
        
        System.out.println("Mascota con mayor peso");
        Mascota mayorPeso = Utilidades.obtenerMayor(mascotas);
        if(mayorPeso != null){
            mayorPeso.mostrarResumen();
        }
        
        System.out.println("Listas Ordenadas");
        System.out.println("Mascotas Ordenadas Por Peso");
        Collections.sort(mascotas);
        Utilidades.mostrarTodos(mascotas);
        System.out.println("Mascotas Ordenadas por nombre");
        Collections.sort(mascotas, new ComparadorMascotaPorNombre());
        Utilidades.mostrarTodos(mascotas);
        
        System.out.println("Iterator Mascotas");
        Iterator <Mascota> iterator = repoMascotas.obtenerTodos().iterator();
        
        while (iterator.hasNext()) {
            Mascota mascota = iterator.next();
            mascota.mostrarResumen();            
        }
        
        System.out.println("Clones");
        Mascota copiaMascota = mascota1.clone();
        Mascota linkMascota = mascota1;
        
        System.out.println("Misma Mascota = " + (linkMascota == mascota1));
        System.out.println("Misma Mascota = " + (copiaMascota == mascota1));
        
        System.out.println("Mismo Duenio = "  +(copiaMascota.getDuenio() == mascota1.getDuenio()));
        
        Mascota copiaMascota2 = mascota1.copiaProfunda();
        System.out.println("Mismo duenio = " + (copiaMascota2.getDuenio() == mascota1.getDuenio()));
        
        System.out.println("Mascota Original: ");
        mascota1.mostrarResumen();
        
        System.out.println("Mascota clonada");
        copiaMascota.mostrarResumen();
        System.out.println("Mascota Clonada 2");
        copiaMascota2.mostrarResumen();
        
        System.out.println("======Clone de Consulta========");
        Consulta copiaConsulta = consulta1.clone();
        System.out.println("Diferentes consultas: " + (copiaConsulta == consulta1));
        System.out.println("Consulta1: ");
        consulta1.mostrarResumen();
        System.out.println("Copia Consulta");
        copiaConsulta.mostrarResumen();
        
        //CRUD        
        //Create
        //Read
        //Update
        //Delete
        
        System.out.println("=== Crud en Memoria (Repositorio)===");
        copiaMascota2.setNombre("Naruto");
        repoMascotas.agregar(copiaMascota2);
        System.out.println("Todas las mascotas del repositorio");
        repoMascotas.listar();
        System.out.println("== Obtener y copiar mascota de Repo");
        Mascota copiaMascotaRepo = repoMascotas.obtener(3).copiaProfunda();
        if (copiaMascotaRepo != null) {
            System.out.println("Los datos de la mascota encontrada son: ");
            copiaMascotaRepo.mostrarResumen();
            System.out.println("Actualizacion de mascota en Repo");
            copiaMascotaRepo.setNombre("Goku SS");
            if (repoMascotas.actualizar(3, copiaMascotaRepo)) {
                System.out.println("Mascota Actualizada con exito!!");
                
            }else{
                System.out.println("No se pudo actualizar la mascota");
            }
            
        }else{
            System.out.println("Mascota no encontrada!");
        }
        
        
        System.out.println("Todas las mascotas del repositorio");
        repoMascotas.listar();
        
        System.out.println("ELiminar Mascota");
        boolean elimino = repoMascotas.eliminar(4);
        if (elimino) {
            System.out.println("Mascota eliminada correctamente");
            
        }else{
            System.out.println("No se pudo eliminar la mascota");
        }
        System.out.println("Todas las mascotas del repositorio");
        repoMascotas.listar();

    }

}
