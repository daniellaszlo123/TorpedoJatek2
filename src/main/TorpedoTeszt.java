
package main;

import java.util.Scanner;


public class TorpedoTeszt {
    private Hajo hajo=new Hajo(3);
    public static void main(String[] args) {
        
    }
    public void beker(){
        int poz;
        String eredmeny;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("lövés: ");
            poz=sc.nextInt();
            eredmeny=tesztLoves(poz);
            System.out.print(eredmeny);
            System.out.println("");
        } while (!(eredmeny.equals("talált süllyedt")));
        System.out.println(hajo.getLepesSzam()+" lövésből");
    }
    
    public String tesztLoves(int poz){
        String t = hajo.talalat(poz);
        assert t.equals("talált") || t.equals("mellé") || t.equals("talált süllyedt") : "nem jó a találat ellenőrzése";
        return t;
    }
}
