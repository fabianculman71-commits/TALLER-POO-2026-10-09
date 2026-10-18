package main;

import clases.Mascota;

public class Veterinaria {

    public static void main(String[] args) {

        Mascota[] mascotas = new Mascota[4];

        mascotas[0] = new Mascota("Luna", "Perro", 28.5, 9);
        mascotas[1] = new Mascota("Michi", "Gato", 4.2, 3);
        mascotas[2] = new Mascota("Rocky", "Perro", 12.0, 5);
        mascotas[3] = new Mascota("Pepa", "Conejo", 2.1, 1);

        int total = 0;

        for (int i = 0; i < mascotas.length; i++) {
            System.out.println(mascotas[i].descripcion());
            System.out.println("Valor de consulta: " + mascotas[i].valorConsulta());

            total = total + mascotas[i].valorConsulta();

        }

        System.out.println("TOTAL RECAUDADO: " + total);

        System.out.println();

        mascotas[1].setPeso(-3);

        System.out.println(mascotas[1].descripcion());
    }
}