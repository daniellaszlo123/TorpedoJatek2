
package main;

import java.util.Scanner;


public class TorpedoTeszt {
    private Hajo hajo=new Hajo(3);
    public static void main(String[] args) {
        
    }
    
    public String tesztLoves(int poz){
        String t = hajo.talalat(poz);
        assert t.equals("talált") || t.equals("mellé") || t.equals("talált süllyedt") : "nem jó a találat ellenőrzése";
        return t;
    }
}
