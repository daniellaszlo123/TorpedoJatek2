
package main;


public class Hajo {
    private int[] pozicio;

    public Hajo(int pozicio) {
        this.pozicio = new int[pozicio];
        this.pozicio[0]=2;
        this.pozicio[1]=3;
        this.pozicio[2]=4;
    }
    
    
    public String talalat(int poz){
        String talaltE="";
        for (int i = 0; i < pozicio.length; i++) {
            if (pozicio[i]==poz) {
                talaltE="talált";
            }
        }
        return talaltE;
    }
}
