// Tienes una colección de bicicletas y vas registrando los últimos modelos que compraste en WallaPop. OK

// - Debes crear una clase Bicicleta con características como: Marca, Modelo, Velocidad Máxima, Si
// tiene marchas o no … (estas características puedes cambiarlas según tu gusto) OK

// - Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar marchas, … OK

// - Recordar que debe haber también un método constructor y un toString() OK

// - Primero probar instanciar una o dos bicicletas sueltas OK

// - Luego, probar a crear un arraylist  de bicicletas OK

// - Y recorrer ese arraylist  para mostrarlo con bucle for y/o for-each OK

// - También se puede mostrar una sola propiedad (o varias) de las bicicletas. Ej: mostrar solo marca y
// velocidad máxima de todas las bicicletas. OK

// - Tema booleanos, probad a ponerlo como texto. Ej: “sí incluye cambio de marchas” (modificar el toString() ) OK

// - Probar métodos set desde el main() OK

// +EXTRA: crear o cambiar o leer desde el scanner de usuario (con o sin bucle) OK

import java.util.ArrayList;
import java.util.Scanner;

public class Java10ejercicio1 {
    public static void main(String[] args) throws Exception {

        // instanciamos tres bicicletas sueltas:

        Bicicletas bicicleta1 = new Bicicletas("Specialized", "S-Works Tarmac", 50, true);
        
        Bicicletas bicicleta2 = new Bicicletas("Trek", "Madone SLR", 45, true);
        
        Bicicletas bicicleta3 = new Bicicletas("Specialized", "Rockhopper", 55, true);

        Bicicletas bicicleta4 = new Bicicletas("Cannondale", "SuperSix EVO", 55, true);

        System.out.println(bicicleta1.toString());
        System.out.println(bicicleta2.toString());
        System.out.println(bicicleta3.toString());
        
        // crear ArrayList de Bicicletas:

        ArrayList <Bicicletas> bicicletasWallaPop = new ArrayList<>();

        bicicletasWallaPop.add(bicicleta1);
        bicicletasWallaPop.add(bicicleta2);
        bicicletasWallaPop.add(bicicleta3);

        System.out.println(bicicletasWallaPop);

        // recorremos ArrayList con bucle forEach:

        for (Bicicletas x: bicicletasWallaPop){
            System.out.println(x);
        }

        // recorremos ArrayList con bucle for:

        for (int i=0; i < bicicletasWallaPop.size(); i++){
            System.out.println(bicicletasWallaPop.get(i));
        }

        // mostrar solo marca y velodicada máxima de las bicicletas con bucle forEach:

        for (Bicicletas x: bicicletasWallaPop){
            System.out.println("La bicicleta " + x.getMarca() + " tiene una velocidad máxima de " + x.getVelocidadMax() + " km/h.");
        }

        // mostrar características extras creadas de metodos extras: 

        bicicleta1.claxon(true);
        bicicleta2.claxon(true);
        bicicleta3.claxon(false);

        bicicleta1.tipoBicicleta();
        bicicleta2.tipoBicicleta();
        bicicleta3.tipoBicicleta();

        // probamos metodos set en el main(): 

        bicicleta1.setVelocidadMax(60);
        bicicleta2.setVelocidadMax(70);
        bicicleta3.setVelocidadMax(75);

        System.out.println(bicicleta1.toString());
        System.out.println(bicicleta2.toString());
        System.out.println(bicicleta3.toString());

        // a partir de un condicional if, ponemos una marca nueva i le muestra al usuario sus propiedades.

        System.out.println("Escribe una marca de la que quieras saber sus propiedades:");
        Scanner sc = new Scanner (System.in);
        String modeloUsuario = sc.nextLine();

        if (modeloUsuario.equals("Cannondale")){
            System.out.println(bicicleta4.toString());
            bicicleta4.claxon(true);
            bicicleta4.tipoBicicleta();
        } else {
            System.out.println("Para este ejercicio, simplemente debes escribir la marca Cannondale");
        }

        sc.close();

    }
}
