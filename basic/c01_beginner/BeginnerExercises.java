package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Aaron";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 33;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.78;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeDeveloper = true;
        System.out.println(likeDeveloper);

        // 5. Declara una constante con tu email.
        final String EMAIL = "example@mail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char charName = 'a';
        System.out.println(charName);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Noia";
        city = "Santiago de Compostela";
        System.out.println(city);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 3;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(city.getClass().getSimpleName());
        System.out.println(name.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String alias;
        alias = "knifeman";
        System.out.println(alias);
    }
}
