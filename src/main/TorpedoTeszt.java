
package main;


public class TorpedoTeszt {
    private Hajo hajo;
    public static void main(String[] args) {
        new TorpedoTeszt().tesztLoves(4);
    }
    public String tesztLoves(int poz){
        hajo= new Hajo(3);
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return t;
    }
}
