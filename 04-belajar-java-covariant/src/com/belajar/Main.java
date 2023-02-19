// JAVA COVARIANT

/*------------------------------------------------------------
*| JAVA COVARIANT
*|------------------------------------------------------------
*| - Artinya kita dapat melakuakan subtitusi child ke parent.
*| - Kuncinya pada tanda ? dan diikuti extends dalam kode.
*| - Covariant adalah read-only, yang tidak dapat merubah data.
*| - Intinya tipe output / retund.
*/

package com.belajar;

import com.belajar.kelas.ArrrayData;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 04 covariant");

        ArrrayData<String> arrrayData = new ArrrayData("papa");
        ArrrayData<? extends Object> arrrayData1 = arrrayData;

        tampilkanData(arrrayData);
        tampilkanData(arrrayData1);

    }

    public static void tampilkanData(ArrrayData<? extends Object> data){
        System.out.println(data.getNama());

        // error read only.
        // data.setNama("jamal");
    }

}