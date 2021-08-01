package com.mycompany.cajeroautomatico;

import java.util.Scanner;



public abstract class ClasePadre_Abstracta{

    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner entrada = new Scanner(System.in);

    public void operaciones(){
        int bandera =0;
        int selecc=0;
        do {
            do{
                System.out.println("Por favor seleccione una opción");
                System.out.println("    1. Consulta de Saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Depósito de efectivo.");
                System.out.println("    4. Salir.");
                selecc = entrada.nextInt();

                if (selecc>=1 && selecc<=4){
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------");
                    System.out.println("Opción no disponible");
                    System.out.println("---------------------------------");
                }

            }while(bandera == 0);
            
            switch (selecc) {
                case 1 ->                     {
                        ClasePadre_Abstracta mensajero = new ClaseHija_consulta();
                        mensajero.Transacciones();
                    }
                case 2 ->                     {
                        ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                        mensajero.Transacciones();
                    }
                case 3 ->                     {
                        ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                        mensajero.Transacciones();
                    }
                case 4 -> {
                    System.out.println("---------------------------------");
                    System.out.println("¡Gracias!, Vuelva pronto.");
                    System.out.println("---------------------------------");
                    bandera=2;
                }
                default -> {
                }
            }

        }while(bandera !=2);



    }

public void Retiro(){
    retiro=entrada.nextInt();
}

public void Deposito(){
    deposito=entrada.nextInt();
}

public abstract void Transacciones();

public int getSaldo(){
   return saldo;
}

public void setSaldo(int saldo){
   ClasePadre_Abstracta.saldo=saldo;
}

}