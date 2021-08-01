package com.mycompany.cajeroautomatico;

public class ClasePrincipal {

    public static void main(String[] args) {
        ClasePadre_Abstracta mensajero = new ClaseHija_consulta();
        mensajero.setSaldo(500);
        mensajero.operaciones();
    }
}
