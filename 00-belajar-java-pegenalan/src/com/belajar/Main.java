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

// di sinilah class generic.
class Data<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 00 JAVA GENERIC PEGENALAN");

        // penggunaan.
        Data<String> dataString = new Data<String>();
        dataString.setData("jarat");

        System.out.println(dataString.getData());
    }
}