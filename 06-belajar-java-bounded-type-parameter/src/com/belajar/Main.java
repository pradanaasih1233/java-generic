// JAVA BOUNDED TYPE PARAMETER

/*------------------------------------------------------------
*| JAVA BOUNDED TYPE PARAMETER
*|------------------------------------------------------------
*| - Digunakan untuk membatasi tipe data yang digunakan.
*| - Dengan menambahkan constraint di generic classnya tide data
*|   yang diperbolehkan.
*| - Secara defaut constrain adalah object.
*|
*|------------------------------------------------------------
*| MULTIPEL BOUNDED TYPE PARAMETER
*|------------------------------------------------------------
*| - Multipel bounded type parameter.
*| - Dengan menambahkan beberapa tipe sekaligus.
*| - Digunakan key &.
*/

package com.belajar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 06 bounded type parameter");

        // Data<Employer> employerData = new Data<Employer>(new VicePresident()); // ERROR
        // Data<Manager> managerData = new Data<Manager>(new VicePresident()); // ERROR.
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
        vicePresidentData.data.sayHello("sayang");

    }

    public static interface CanSayHello{
        void sayHello(String name);
    }
    public static abstract class Employer{}
    public static class Manager extends Employer{}
    public static class VicePresident extends Employer implements CanSayHello{
        @Override
        public void sayHello(String name) {
            System.out.println("hello " + name);
        }
    }

    //------------------------------------------------------------

    public static class Data<T extends Employer & CanSayHello>{
        private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

}