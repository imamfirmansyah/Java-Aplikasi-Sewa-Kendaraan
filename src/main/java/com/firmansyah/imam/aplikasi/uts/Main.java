package com.firmansyah.imam.aplikasi.uts;

public class Main {
    public static void main(String[] x){
        
        System.out.println("Mengakses HTTP Service");
        
        // memanggil form login
        FormUser callForm = new FormUser();
        callForm.setVisible(true);   
                
    }
}