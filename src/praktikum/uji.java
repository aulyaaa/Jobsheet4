/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author user
 */
public class uji {
    public static void main(String[] args) {
        
        System.out.println();
      System.out.println("========== MANUSIA =========");
            Manusia h = new Manusia();
            h.settinggi();
            h.setjenis();
            h.setberat();
            
        System.out.println();
        System.out.println("========== USER 1 ==========");
        use1 a = new use1();
        a.settinggi();
        a.setjenis();
        a.setberat();
        
        System.out.println();
        System.out.println("========== USER 2 ==========");
        user2 b = new user2();
        b.settinggi();
        b.setjenis();
        b.setberat();
    }
}
