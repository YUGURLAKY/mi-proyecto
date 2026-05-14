public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int suma = sumar(5, 3);
        int multiplicacion = multiplicar(5, 3);

        System.out.println("Suma: " + suma);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}