package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Aaron";
        String surname = "Garcia";
        int age = 33;
        System.out.println(name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name.length()); 

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("hello world".contains(name));

        // 6. Formatea un string con un entero.
        System.out.println(String.format("Hola mi nombre es %s y tengo %d años", name, age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String alias = "  Aaron-GF  ";
        System.out.println(alias.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(alias.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(alias));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name.length() == alias.length());
    }
}
