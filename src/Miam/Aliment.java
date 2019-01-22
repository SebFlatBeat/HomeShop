package com.cursan.miam;

public class Aliment {
            String nom;
            boolean estCuit;

            public void manger() {
                if (estCuit) {
                    System.out.println("Miam miam cet aliment: " + nom + " est cuit");
                }else {
                    System.out.println("Beeeeeerk cet aliment: " + nom + " est cru !");
                }
            }
}
