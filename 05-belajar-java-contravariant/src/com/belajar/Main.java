// JAVA CONTRAVARIANT

/*------------------------------------------------------------
*| JAVA CONTRAVARIANT
*|------------------------------------------------------------
*| - Artinya kita dapat melakuakan subtitusi parentke child.
*| - Kuncinya pada tanda ? dan diikuti dengan super dalam kode.
*| - Covariant adalah write/read, tp dapat fatal jika read.
*| - Intinya tipe input.
*/

package com.belajar;

import com.belajar.kelas.ArrrayData;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 05 contravariant");

        ArrrayData<Object> arrrayData = new ArrrayData("papa");

        // ini akan menimbulkan error bila salah set tipe data.
        // arrrayData.setNama(10000);

        tampilkanData(arrrayData);

        ArrrayData<? super String> arrrayData1 = arrrayData;
        tampilkanData(arrrayData1);

    }

    public static void tampilkanData(ArrrayData<? super String> data){
        System.out.println(data.getNama());

        // error di get.
        String dataStr = (String) data.getNama();
        System.out.println(dataStr);

        // tidak error read only.
        data.setNama("kamu aja");
    }

}