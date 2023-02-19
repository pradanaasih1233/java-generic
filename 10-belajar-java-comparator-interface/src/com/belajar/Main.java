// JAVA COMPARATOR INTERFACE

/*------------------------------------------------------------
*| JAVA COMPARATOR INTERFACE
*|------------------------------------------------------------
*| - Merupakan pengecekan selain comparable.
*| - Biasa digunakan untuk menghandle class buatan orang lain
*|   dimana kita tidak dapat merubah source codenya.
*| - Ini banyak digunakn untuk mengurutkan data dan lain-lain.
*|
*/

package com.belajar;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

class MyData  implements Comparable<MyData>{

    private String nama;
    private String country;

    public MyData(String nama, String country) {
        this.nama = nama;
        this.country = country;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public java.lang.String toString() {
        return "MyData{" +
                "nama=" + nama +
                ", country=" + country +
                '}' + '\n';
    }

    @Override
    public int compareTo(@NotNull MyData o) {
        return this.nama.compareTo(o.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 10 comparator interface");

        // contoh aplikasi pegurutan data :
        MyData[] myData = {
          new MyData("anisa", "indonesia"),
          new MyData("ridwan", "indonesia"),
          new MyData("zizah", "indonesia"),
          new MyData("nur", "indonesia"),
          new MyData("budi", "indonesia")
        };
//------------------------------------------------------------

        Comparator<MyData> comparator = new Comparator<MyData>() {
            @Override
            public int compare(MyData o1, MyData o2) {
                return o1.getNama().compareTo(o2.getNama());
            }
        };
//------------------------------------------------------------

        Arrays.sort(myData);

        System.out.println(Arrays.toString(myData));

    }

}