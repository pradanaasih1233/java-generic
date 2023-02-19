// JAVA WILDCARD

/*------------------------------------------------------------
*| JAVA WILDCARD
*|------------------------------------------------------------
*| - Digunakan pada saat kita tidak peduli parameter type pada
*|   object.
*| - Misal hanya ingin untuk print data T, tidak peduli tipe
*|   apa pun.
*| - Maka digunakan wildcard atau ?.
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
        System.out.println("\nBELAJAR JAVA 07 wildcard");

        print(new MyData<String>("saya"));
        print(new MyData<Integer>(100));
        print(new MyData<Character>('c'));
    }

    //------------------------------------------------------------
    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
    //------------------------------------------------------------



}