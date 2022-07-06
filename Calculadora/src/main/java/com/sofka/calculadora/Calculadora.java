
package com.sofka.calculadora;

/**
 * @author sebas
 */

import java.util.Scanner;

public class Calculadora {
    
    private static final Scanner getData = new Scanner(System.in);
    
    public static double[] getNum(){
        
        double[] numbers = new double[2];
        
        System.out.println("Digite 2 numeros: ");
        
        for(int i = 0; i<=1; i++){
            System.out.println("Numero "+(i+1)+": ");
            numbers[i] = getData.nextDouble();
        }
        
        return(numbers);
        
    }
    
    public static double suma (double a , double b){
        return (a+b);
    }
    
    public static double resta (double a , double b){
        return (a-b);
    }
    
    public static double multiplicacion (double a , double b){
        return (a*b);
    }
    
    public static double division (double a , double b){
        
        while(b==0){
            System.out.println("El segundo numero ingresado es 0 no se puede efectuar la division, cambielo: ");
            b = getData.nextDouble();
        }
        
        return (a/b);
    }
    
    public static double mod (double a , double b){
        
        while(b==0){
            System.out.println("El segundo numero ingresado es 0 no se puede obtener el modulo de la division, cambielo: ");
            b = getData.nextDouble();
        }
        
        return (a%b);
    }

    public static void main(String[] args) {
        
        boolean seguir;
        
        do{
            
            int option;
            
            System.out.println("\n+ ---- Calculadora ---- +");
            System.out.println("- 1. Sumar");
            System.out.println("- 2. Restar");
            System.out.println("- 3. Multiplicar");
            System.out.println("- 4. Dividir");
            System.out.println("- 5. MOD");
            System.out.println("- 6. Salir");
            System.out.println("+ --------------------- +");
            
            System.out.println("  Escoja una opcion");
            option = getData.nextInt();
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            if(option==6){
                
                System.out.println("\n¡Has salido de la calculadora!\n");
                seguir = false;
                
            }else{
                
                seguir=true;
                
                double[] data = getNum();
                double numberOne = data[0];
                double numberTwo = data[1];
                
                switch (option) {
                    
                    case 1 -> System.out.println("\n-> El resultado de la suma es: " + suma(numberOne,numberTwo));
                    case 2 -> System.out.println("\n-> El resultado de la resta es: " + resta(numberOne,numberTwo));
                    case 3 -> System.out.println("\n-> El resultado de la division es: " + multiplicacion(numberOne,numberTwo));
                    case 4 -> System.out.println("\n-> El resultado de la multiplicacion es: " + division(numberOne,numberTwo));
                    case 5 -> System.out.println("\n-> El resultado de el modulo de la division es: " + mod(numberOne,numberTwo));
                    default -> throw new AssertionError();
                        
                }
                              
            }
            
        }while(seguir);
    
    }

}
