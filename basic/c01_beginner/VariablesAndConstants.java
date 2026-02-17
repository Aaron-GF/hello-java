package basic.c01_beginner;

/*
Clase 15 - Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=5294
*/

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables

        String name = "Aaron";
        System.out.println(name);

        name = "Aaron-GF";
        System.out.println(name);

        // name = 33; Error (no podemos cambiar el tipo de dato)

        int age = 33;
        System.out.println(age);

        var email = "aarongarcia@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "aarongarcia@gmail.com";
        // EMAIL = "aarongarcia@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}
