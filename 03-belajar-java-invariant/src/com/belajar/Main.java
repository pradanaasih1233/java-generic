// JAVA INVARIANT

/*------------------------------------------------------------
*| JAVA INVARIANT
*|------------------------------------------------------------
*| - Secara default, generic parameter type bersifat invariant.
*| - Invariant berarti tidak dapat disiptitusi oleh child atau
*|   supertype(parent).
*/

package com.belajar;

import com.belajar.kelas.ArrrayData;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 03 invariant");

        // penggunaan.
        ArrrayData<String, Integer> arrayData = new ArrrayData<>("jarat",19);
        ArrrayData<Integer,Integer> arrayDataInt = new ArrrayData<>(10,10);

        // Error.
        // ArrrayData<Object,Object> arrayObject = arrayData;
        // ArrrayData<Integer,Integer> arrayObject = arrayData;
        // tampilkanDataInteger(arrayData);
        // tampilkanDataObj(arrayDataInt);

        // benar.
        ArrrayData<String, Integer> arrrayData3 = new ArrrayData<>("kamu", 21);
        tampilkanDataIntegerStr(arrrayData3);

    }

    public static void tampilkanDataInteger(ArrrayData<Integer,Integer> data){}
    public static void tampilkanDataIntegerStr(ArrrayData<String,Integer> data){
        System.out.println("papa berhasil...");
    }
    public static void tampilkanDataObj(ArrrayData<Object,Object> data){}
}