/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Toshiba
 */
public class MatematikaCanggih extends Matematika {
    
    private int hasil;
    
    void setTambah (int a, int b){
        hasil = a + b;
    }
    
    void setPerkalian (int a, int b){
        hasil = a * b;
    }
    
    void setModulus (int a, int b){
        hasil = a % b;
    }

    int getHasil(){
        return hasil;
    }
}
