package com.belajar.kelas;

public class ArrrayData<T>{
    private T nama;

    public ArrrayData(T nama) {
        this.nama = nama;
    }

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }
}
