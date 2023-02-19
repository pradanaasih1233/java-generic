// JAVA COMPARABLE INTERFACE

/*------------------------------------------------------------
*| JAVA COMPARABLE INTERFACE
*|------------------------------------------------------------
*| - Merupakan pengecekan generic yang wajib mewariskan interface
*|   geberic Comparable.
*| - Ini banyak digunakn untuk mengurutkan data dan lain-lain.
*|
*/

package com.belajar;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

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
        System.out.println("\nBELAJAR JAVA 09 comparable");

        // contoh aplikasi pegurutan data :
        MyData[] myData = {
          new MyData("anisa", "indonesia"),
          new MyData("ridwan", "indonesia"),
          new MyData("azizah", "indonesia"),
          new MyData("nur", "indonesia"),
          new MyData("budi", "indonesia")
        };

        Arrays.sort(myData);

        System.out.println(Arrays.toString(myData));

    }

}