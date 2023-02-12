package com.belajar.kelas;

public class ArrrayData<T, U>{
    private T nama;
    private U umur;

    public ArrrayData(T nama, U umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }

    public U getUmur() {
        return umur;
    }

    public void setUmur(U umur) {
        this.umur = umur;
    }

    public static <T> int hitung(T[] array){
        System.out.println("panjang dari array adalah = " + array.length);
        System.out.println(array.getClass());
        return array.length;
    }
}
