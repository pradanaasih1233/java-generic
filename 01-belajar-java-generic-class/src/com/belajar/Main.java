// JAVA GENERIC PEGENALAN

/*------------------------------------------------------------
*| JAVA GENERIC PEGENALAN
*|------------------------------------------------------------
*| - Merupakan kemampuan untuk  menambahkan parameter type saat
*|   membuat class atau method.
*| - Generic memungkinkan kita untuk mengubah ubah tipe data
*|   sesuai dengan keinginan kita.
*| - Digunakan untuk mengecek pada saat prosess kopilasi.
*| - Juga tidak perlu membuat konversi manual dan pengecekan manual.
*|
*/

package com.belajar;

import com.belajar.kelas.Data;
import com.belajar.kelas.MultiParameterGeneric;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 01 JAVA GENERIC CLASS");

        // penggunaan.
        Data<String> dataString = new Data<String>();
        dataString.setData("jarat");
        System.out.println(dataString.getData());


        MultiParameterGeneric<String, Integer> multiParameterGeneric = new MultiParameterGeneric<>("jarat",19);
        System.out.println(multiParameterGeneric.getNama());
        System.out.println(multiParameterGeneric.getUmur());


    }
}