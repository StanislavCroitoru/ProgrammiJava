package com.dipendente;

public class Main {

    public static void main(String[] args) {
        Dipendente dipendente = new Dipendente("Stefanuz", "Maffei", "Supporto telefonico",
                "Moldcell", 1200F);

        dipendente.aumento(20F);

        dipendente.bonus(5F);

        dipendente.print();
    }
}
