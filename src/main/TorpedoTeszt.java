
package main;


public class TorpedoTeszt {
    private Hajo hajo;
    public void main(String[] args) {
        tesztLoves(0);
    }
    public String tesztLoves(int poz){
        hajo= new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
}
