import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer opc = (0);


        while(opc != 4){
            System.out.println(" \n Menu \n 1) Ciclo For \n 2) Condicion if \n 3) Ciclo Do While \n 4) SALIR DEL MENU  \n");
            System.out.println("INGRESA UNA OPCION DEL MENU DE ACUERDO AL NUMERO DE OPCIONES");
            opc = teclado.nextInt();



            switch (opc){
                case 1: System.out.println("INGRESA TU PRIMER NOMBRE PARA SABER CUALES SON TUS NUMEROS DE LA SUERTE");
                String palabra = ("");
                palabra = teclado.next();
                System.out.println("TUS NUMEROS DE LA SUERTE SON:");
                for(int i=1 ; i<=palabra.length(); i++){
                    Integer numero = i++;
                    Integer letra = i * numero;
                    System.out.println(letra);
                }
                break;

                case 2: System.out.println("INGRESA UN NUMERO PARA SABER CUANTOS DIGITOS TIENE");
                Integer numero = 0;
                numero = teclado.nextInt();
                if(numero<10){
                    System.out.println("Tu numero es de un digito");
                }if(numero>=10 && numero<100){
                    System.out.println("Tu numero es de dos digitos");
                }if(numero>=100 && numero<1000){
                    System.out.println("Tu numero es de tres digitos");
                }if(numero>=1000 && numero<10000){
                    System.out.println("Tu numero es de cuatro digitos");
                }if(numero>=10000){
                    System.out.println("Tu numero es de cinco o mas digitos");
                }
                break;


                case 3:
                    Integer numeroSecreto = 12;
                    Integer numeroUsuario = 0;
                    Integer intentos=0;
                    do{
                        System.out.println("ADIVINA EL NUMERO SECRETO ENTRE EL O Y EL 20");
                        numeroUsuario = teclado.nextInt();
                        intentos++;
                        if(numeroUsuario != numeroSecreto){
                            System.out.println("no adivinaste el numero, intenta nuevamente\nintento numero: " + intentos);
                        }
                } while(numeroUsuario != numeroSecreto);

                    System.out.println("CORRECTO ADIVINASTE EL NUMERO SECRETO !!!");
            break;
            }


    }
        System.out.println("SALISTE DEL MENU PRINCIPAL");
        System.out.println("BYEEEE");

    }
}