package com.mycompany.cajeroautomatico;



public class ClaseHija_consulta extends ClasePadre_Abstracta{

@Override
public void Transacciones(){
    System.out.println("\n---------------------------------");
    System.out.println("Tu saldo es: " + getSaldo());
    System.out.println("---------------------------------");
}

}