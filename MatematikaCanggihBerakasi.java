/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author Toshiba
 */
public class MatematikaCanggihBerakasi {
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();
        
        math.setAngka1(5);
        math.setAngka2(3);
        
        math.setTambah(math.getAngka1(), math.getAngka2());
        System.out.println("Hasil pertambahan dari " + math.getAngka1() + " + " + math.getAngka2() + " = " + math.getHasil());
        
        math.setPerkalian(math.getAngka1(), math.getAngka2());
        System.out.println("Hasil perkalian dari " + math.getAngka1() + " x " + math.getAngka2() + " = " + math.getHasil());
        
        math.setModulus(math.getAngka1(), math.getAngka2());
        System.out.println("Hasil modulus dari " + math.getAngka1() + " % " + math.getAngka2() + " = " + math.getHasil());
    }
    
}