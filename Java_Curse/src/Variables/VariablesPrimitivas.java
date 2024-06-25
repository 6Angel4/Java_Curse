package Variables;

public class VariablesPrimitivas {
    public static void main(String[] args) {
        // byte: rango de -128 a 127
        byte edad = 25;
        System.out.println("Edad: " + edad);

        // short: rango de -32,768 a 32,767
        short year = 2023;
        System.out.println("Año: " + year);

        // int: rango de -2^31 a 2^31-1
        int salario = 50000;
        System.out.println("Salario: " + salario);

        // long: rango de -2^63 a 2^63-1
        long poblacionMundial = 7800000000L;
        System.out.println("Población Mundial: " + poblacionMundial);

        // float: precisión simple de 32 bits
        float temperatura = 36.6f;
        System.out.println("Temperatura: " + temperatura);

        // double: precisión doble de 64 bits
        double precio = 12345.67;
        System.out.println("Precio: " + precio);

        // boolean: verdadero o falso
        boolean esJavaGenial = true;
        System.out.println("¿Es Java Genial?: " + esJavaGenial);

        // char: un carácter Unicode
        char inicial = 'J';
        System.out.println("Inicial: " + inicial);
    }
}
