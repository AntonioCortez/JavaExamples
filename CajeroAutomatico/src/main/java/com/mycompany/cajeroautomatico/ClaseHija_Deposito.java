package com.mycompany.cajeroautomatico;

public class ClaseHija_Deposito extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.println("Cuanto desea Depositar: ");
        Deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo Actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }
}
