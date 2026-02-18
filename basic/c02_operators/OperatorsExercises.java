package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var num1 = 7 + 1;
        var num2 = 3 - 2;
        var m = num1 * num2;
        var d = m / 2;
        var r = d % 2;

        // 2. Crea una variable para cada tipo de operación de asignación.
        var a = 5;
        a += 2;
        a -= 1;
        a *= 3;
        a /= 2;
        a %= 2;
        System.out.println(a);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(d < num1);
        System.out.println(m >= r);
        System.out.println(num1 != num2);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(d > num2);
        System.out.println(m < r);
        System.out.println(num1 == num2);

        // 5. Utiliza el operador lógico and.
        System.out.println(true && false);

        // 6. Utiliza el operador lógico or.
        System.out.println(false || true);

        // 7. Combina ambos operadores lógicos.
        System.out.println(num1 == num2 || true && false);

        // 8. Añade alguna negación.
        System.out.println(!true);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(num1++);
        System.out.println(--num1);
        System.out.println(-num2);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println(2 * 5 == 5 || false );
    }
}
