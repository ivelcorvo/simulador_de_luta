package oo6;
public class OO6 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[5];
        
        l[0]= new Lutador("levi","brasileiro",21,1.63f,67.5f,13,2,1);
        l[1] = new Lutador("jader","brasileiro",18,1.60f,60f,14,1,0);
        l[2] = new Lutador("iago","tailandes",17,60f,1.70f,10,5,1);
        l[3] = new Lutador("caio","basileiro",18,65f,1.70f,12,3,1);
     //   l[0].apresentar();
     //   l[0].status();
     //   l[1].apresentar();
     //   l[1].status();
        
        Luta ufc1 = new Luta();
        ufc1.marcarLuta(l[0],l[1]);
        ufc1.lutar();
        l[0].apresentar();
        l[1].apresentar();
        
    }
    
}
