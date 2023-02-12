package com.belajar.kelas;

public class MultiParameterGeneric <T, U>{
    private T nama;
    private U umur;

    public MultiParameterGeneric(T nama, U umur) {
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
}
