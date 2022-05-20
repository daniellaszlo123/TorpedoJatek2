
package main;

import java.util.Random;


public class Hajo {
    private int[] pozicio;
    private Random rnd;
    private int talalatSzam=0;
    private int lepesSzam=0;

    public Hajo(int hajoHossz) {
        this.pozicio = new int[hajoHossz];
        rnd=new Random();
        hajoElhelyez();
    }
    
    
    public String talalat(int poz){
        String talaltE;/*="";*/
        int i=0;
        while(i<pozicio.length && !(pozicio[i]==poz)) {
            i++;
        }
            if (i<pozicio.length) {
                talaltE="talált";
                talalatSzam++;
            }
            else{
                talaltE="mellé";
            }
            if (talalatSzam>2) {
                talaltE="talált süllyedt";
            }
            lepesSzam++;
        
        return talaltE;
    }

    public int getLepesSzam() {
        return lepesSzam;
    }

    private void hajoElhelyez() {
        this.pozicio[0]=rnd.nextInt(6)+1;
        int elsoPoz=this.pozicio[0];
        switch (elsoPoz) {
            case 1:
                for (int i = 1; i < this.pozicio.length; i++) {
                    this.pozicio[i]=elsoPoz+(i+1);
                }   break;
            case 7:
                for (int i = 1; i < this.pozicio.length; i++) {
                    this.pozicio[i]=elsoPoz-(i+1);
                }   break;
            default:
                this.pozicio[1]=elsoPoz-1;
                this.pozicio[2]=elsoPoz+1;
                break;
        }
    }
}
