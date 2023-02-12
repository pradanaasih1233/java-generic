// JAVA GENERIC PEGENALAN

/*------------------------------------------------------------
*| JAVA GENERIC PEGENALAN
*|------------------------------------------------------------
*| - Generic parameter bisa deklarasikan di method, hanya bisa
*|   diakses di method tersebut.
*| - Ini cocok untuk membuat generic method, tanpa harus mengu-
*|   bah deklarasi class.
*|
*/

package com.belajar;

import com.belajar.kelas.ArrrayData;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 01 JAVA GENERIC METHOD");

        // penggunaan.
        ArrrayData<String, Integer> arrrayData = new ArrrayData<>("jarat",19);
        System.out.println(arrrayData.getNama());
        System.out.println(arrrayData.getUmur());


        Integer[] arrayInt = {1,2,3,4,5,6,7,};
        String[]  arrayString = {"jarat","papa","yy"};

        ArrrayData.<Integer>hitung(arrayInt);
        ArrrayData.<String>hitung(arrayString);
    }
}