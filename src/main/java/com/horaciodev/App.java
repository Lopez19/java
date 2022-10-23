package com.horaciodev;

/**
 *
 * @author horac
 */
public class App {

    //Ejercicio #1: Invertir una cadena
    private void InvertirString(String text) {

        //Desde 0 (Algoritmo)
        //Texto de entrada
        System.out.println("Texto Original: " + text);

        //Variables
        String[] arrayStrings = text.split("");
        StringBuilder newTextBuilder = new StringBuilder();
        
        for (int i = arrayStrings.length; i > 0; i--) {

            //Agrege de atras haci adelante
            newTextBuilder.append(arrayStrings[i - 1]);
            
        }
        System.out.println("Texto Invertido: " + newTextBuilder);

        //Usando Clases de Java
        System.out.println("Texto Original: " + text);
        
        String newString = new StringBuilder(text).reverse().toString();
        
        System.out.println("Texto Invertido: " + newString);
        
    }

    //Ejercicio #2: Determinar si un numero es capicua (se puede leer igual de atras hacia adelante)
    private void ComprobarCapicua(int number) {
        //Variables
        String numberString = String.valueOf(number);
        String reverseString = new StringBuilder(numberString).reverse().toString();
        
        if (numberString.equals(reverseString)) {
            
            System.out.println("Los numeros son capicuas \n");
            System.out.println("Numero Original: " + numberString);
            System.out.println("Numero Reverso: " + reverseString);
            
        } else {
            System.out.println("Los numeros NO son capicuas \n");
            System.out.println("Numero Original: " + numberString);
            System.out.println("Numero Reverso: " + reverseString);
        }
        
    }

    //Ejercicio #3: Contador de caracteres
    private void ContarCaracteres(String text) {
        
        int i, lenght, counter[] = new int[256];
        
        lenght = text.length();
        
        for (i = 0; i < lenght; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] +1;
            counter[text.charAt(i)]++;
        }
        
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
        
    }
    
    //Ejercicio #4: Caracteres Repetidos
    private void CaracteresRepetidos(String text) {
        int i, lenght, counter[] = new int[256];
        
        lenght = text.length();
        
        for (i = 0; i < lenght; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] +1;
            counter[text.charAt(i)]++;
        }
        
        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        //Instanicamos la clase
        App app = new App();

//Ejercicio #1
//        app.InvertirString("Horaciodev");
//Ejercicio #2
//        app.ComprobarCapicua(2001);
//Ejercicio #3
//        app.ContarCaracteres("Horacio");
//Ejercicio #4
        app.CaracteresRepetidos("Horacio Lopez Moreno");
        
    }
    
}
