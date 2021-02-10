package oo6;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;
    private int rouds;
    //===============================================================================
    // getters and setters
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRouds() {
        return rouds;
    }
    public void setRouds(int rouds) {
        this.rouds = rouds;
    }
    //===============================================================================        
    // metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1 != l2)&&(l1.getCategoria()==l2.getCategoria())){                
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            this.setAprovada(true);
        }else{
            this.setDesafiante(null);
            this.setDesafiado(null);
            this.setAprovada(false);    
        }        
    }
    //===============================================================================        
    public void lutar(){
        if(this.isAprovada() == true){
            System.out.println("|| DESAFIANTE ||");
            this.getDesafiante().apresentar();
            System.out.println("|| DESAFIADO ||");
            this.getDesafiado().apresentar();
            
            Random r = new Random();
            
            int iResult = r.nextInt(3); // 0,1,2,3
            switch(iResult){
                case 0:
                    System.out.println("|| EMPATE ||");
                    this.getDesafiante().empate();
                    this.getDesafiado().empate();
                    break;
                case 1:
                    System.out.println("|| VITÓRIA DE: "+this.getDesafiante().getNome()+" ||");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2:
                    System.out.println("|| VIÓTRIA DE: "+this.getDesafiado().getNome()+" ||");
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().ganharLuta();
            }
        }else{
            System.out.println("|| LUTA NÃO PODE ACONTECER ||");
        }
    }
}
