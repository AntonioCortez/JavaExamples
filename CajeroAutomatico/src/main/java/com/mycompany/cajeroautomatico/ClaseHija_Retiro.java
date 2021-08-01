package com.mycompany.cajeroautomatico;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.println("Cuanto desea retirar: ");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("---------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es : " + getSaldo());
            System.out.println("---------------------------------");
        } else {
            System.out.println("---------------------------------");
            System.out.println("SALDO INSUFICIENTE.");
            System.out.println("---------------------------------");
        }
    }
}
