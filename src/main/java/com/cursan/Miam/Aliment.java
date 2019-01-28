package com.cursan.Miam;

public class Aliment {
            String nom;
            boolean estCuit;

            public void manger() {
                if (estCuit) {
                    System.out.println("com.cursan.Miam miam cet aliment: " + nom + " est cuit");
                }else {
                    System.out.println("Beeeeeerk cet aliment: " + nom + " est cru !");
                }
            }
}
