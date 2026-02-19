package basic.c03_strings;

public class Strings {

    public static void main(String[] args) {

        /*
        Clase 24 - Strings
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8140
        */

        // Declaración

        String name = "Aaron";
        var surname = new String("Garcia");

        // Operaciones básicas

        /*
        Clase 25 - Concatenación
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8367
        */

        // Concatenación
        System.out.println(name + " " + surname);

        /*
        Clase 26 - length
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8469
        */

        // Longitud
        System.out.println(name.length());

        /*
        Clase 27 - charAt
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8535
        */

        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1));

        /*
        Clase 28 - substring
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8707
        */

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        /*
        Clase 29 - toUpperCase / toLowerCase
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8831
        */

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        /*
        Clase 30 - contains
        Vídeo: https://youtu.be/JOAqpdM36wI?t=8947
        */

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Aaron"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        /*
        Clase 31 - equals
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9118
        */

        // Comparación
        System.out.println(name.equals("Aaron"));
        System.out.println(name.equals("aaron"));
        System.out.println(name.equalsIgnoreCase("aaron"));

        // == vs. equals

        var a = "Aaron";
        var b = "Aaron";
        var c = new String("Aaron");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        /*
        Clase 32 - trim y replace
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9456
        */

        // Trim
        System.out.println(" Hola, me llamo Aaron ".trim());

        // Replace
        System.out.println(" Hola, me llamo Aaron ".replace("Aaron", "Garcia"));

        /*
        Clase 33 - format
        Vídeo: https://youtu.be/JOAqpdM36wI?t=9613
        */

        // Format
        var age = 33;
        System.out.println(String.format("Hola, %s. Tengo %d.", name, age));
    }
}
