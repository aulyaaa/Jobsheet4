/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumP;

/**
 *
 * @author user
 */
public class kucing extends hewan {
    @Override
    public void setNama()
    {
        String kucing = "Carberus";
        System.out.println("Nama Kucing : "+kucing);
    }
    @Override
    public void setSuara()
    {
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Kucing : "+suara);
    }
    @Override
    public void setBerat()
    {
        double berat = 2.0;
        System.out.println("Berat Kucing : "+berat+" Kg");
    }
}
