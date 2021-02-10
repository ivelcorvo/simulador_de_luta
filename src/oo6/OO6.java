package oo6;

import java.util.Scanner;

public class OO6 {
    public static void main(String[] args) {
        int iPronto = 0, iLutador, iRespValida; 
        String sResposta;
        
        Scanner lut = new Scanner(System.in);  // pegará a opção do lutador 
        Scanner resp = new Scanner(System.in); // pegará resposta de sim ou não
        
        Lutador l[] = new Lutador[2];
        Luta luta = new Luta();
        // futuramente, pretendo fazer cadastrar lutadores
        l[0] = new Lutador("Jason Voorhees","Americano",11,1.90f,100.0f,13,0,0); 
        l[1] = new Lutador("Michael Myers","Americano",40,2.00f,100.0f,31,0,0);
        
        do{
            System.out.println("++---------------------------------++\n"+
                               "||        ESCOLHA O LUTADOR        ||\n"+
                               "++---------------------------------++\n"+
                               "|| [1] - Jason Voorhees            ||\n"+
                               "|| [2] - Michael Myers             ||\n"+ 
                               "++---------------------------------++\n");
            do{
                System.out.print("|| LUTADOR => ");
                iLutador = lut.nextInt();
            
                if((iLutador < 1)||(iLutador > 2)){
                    System.out.println("|| LUTADOR INVÁLIDO||");
                }else if(iLutador == 1){
                    luta.marcarLuta(l[0], l[1]);            
                }else if(iLutador == 2){
                    luta.marcarLuta(l[1], l[0]);
                }                
            }while((iLutador < 1)||(iLutador > 2)); //repete até escolher um lutador válido
            
            do{
                System.out.print("|| VOCÊ ESTÁ PRONTO? (S/N) => ");
                sResposta = resp.nextLine();
                sResposta = sResposta.toUpperCase();
                
                if(sResposta.equals("S")){
                    iPronto = 1;
                    iRespValida = 1;
                }else if(sResposta.equals("N")){
                    iPronto = 0;
                    iRespValida = 1;
                }else{
                    System.out.println("|| RESPOSTA INVÁLIDA ||");            
                    iRespValida = 0;
                }                    
            }while(iRespValida == 0); // repete até ter uma resposta válida        
        }while(iPronto == 0); // repete até estar pronto
        
        luta.lutar();
        l[0].status();
        l[1].status();
    }
    
}
