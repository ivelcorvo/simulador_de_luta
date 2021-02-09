package oo6;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;
    private int rouds;
    
    // metodos
    
 
    
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
    
    
    
    
       public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria()== l2.getCategoria())&&(l1!=l2)){
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
        
    }
    
    public void lutar(){
        if(this.isAprovada()==true){
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0,1,2
            switch(vencedor){
                case 0://empate
                    System.out.println("empatou");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    break;
                case 1://desafiante vence
                    System.out.println(this.getDesafiante().getNome()+" venceu");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2://desafiado vence
                    System.out.println(this.getDesafiado().getNome()+" venceu");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
            }
        }else{
            System.out.println("luta não pode acontecer");
        }
        
    }
}
