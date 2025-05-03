/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semanaa_5;

import java.util.ArrayList;

/**
 *
 * @author USURIO
 */
public class Metodo_colecciones {
   public static void mostrar() {
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Manzana");
        lista.add("Plátano");
        lista.add("Fresa");

        System.out.println("Frutas agregadas:");
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        String fruta = null;
        if (lista.size() > 5) {
            fruta = lista.get(5);
            // Puedes usar la variable fruta acá sin imprimir nada
        } else {
            // No hay elemento en la posición 5, se evita la excepción
            fruta = null;
        }

        try {
            String texto = null;
            System.out.println(texto.length()); // Esto genera un error porque es null
        } catch (Exception e) {
            System.out.println("Ocurrió un error: No se puede mostrar el texto porque está vacío.");
        }
    }
    
}
