// JAVA TYPE ERASURE

/*------------------------------------------------------------
*| JAVA TYPE ERASURE
*|------------------------------------------------------------
*| - Merupakan pegecekan generic pada saat compile time, dan
*|   menghiraukan pegecekan pada saat runtime.
*| - Type erasure menjadikan informasi generic yang kita buat
*|   akan hilang ketika kode progam dicompail menjadi binary.
*| - Compailer akan mengubah type generic menjadi tipe Object
*|   di java.
*|
*|------------------------------------------------------------
*|   HAL INI LAH YANG MEMBUAT KONVERSI TIPE GENERIC DI JAVA
*|   HARUS BIJAK.
*|-------------------------------------------------------------
*/

package com.belajar;

class MyData<T>{

    public MyData(T data) {
        this.data = data;
    }

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
        System.out.println("\nBELAJAR JAVA 08 type erasure");

        MyData myData = new MyData("papa");

        // ini tidak akan error dalam compilasi, tapi akan error pada
        // runtime.
        MyData<Integer> integerMyData = myData;
    }

}