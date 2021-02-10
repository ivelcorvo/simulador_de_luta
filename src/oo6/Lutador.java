package oo6;

public class Lutador {
    private String nome;
    private String origem;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //===============================================================================
    //construtor
    public Lutador(String nome, String origen,
                   int idade, float altura, 
                   float peso, int vitorias, 
                   int derrotas, int empates) {
        this.setNome(nome);
        this.setOrigem(origen);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    //===============================================================================
    //getters setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem(){
        return this.origem;
    }
    public void setOrigem(String origem){
        this.origem = origem;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(){
        if((this.getPeso() < 50.0)||(this.getPeso() > 120.0 )){
            this.categoria="CATEGORIA INVÁLIDA";
        }else if(this.getPeso() <= 70.0){
            this.categoria="LEVE";
        }else if(this.getPeso() <= 90.0){
            this.categoria="MEDIO";
        }else if(this.getPeso() <= 120){
            this.categoria="PESADO";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }    
    //===============================================================================
    // metodos    
    public void apresentar(){
        System.out.println("++-------------------------------------------------++\n"+
                           "||                  APRESENTAÇÃO                   ||\n"+
                           "++-------------------------------------------------++\n"+
                           "|| LUTADOR: "+this.getNome()+"\n"+
                           "|| ORIGEN: "+this.getOrigem()+"\n"+
                           "|| IDADE: "+this.getIdade()+" ANOS\n"+
                           "|| "+this.getAltura()+" METROS\n"+
                           "|| PESANDO: "+this.getPeso()+" KG\n"+
                           "|| CATEGORIA: "+this.getCategoria()+"\n"+
                           "|| GANHOU: "+this.getVitorias()+"\n"+
                           "|| PERDEU: "+this.getDerrotas()+"\n"+
                           "|| EMPATOU: "+this.getEmpates()+"\n"+
                           "++-------------------------------------------------++");        
    }
    //===============================================================================
    public void status(){
        System.out.println("++-------------------------------------------------++\n"+
                           "|| NOME: "+this.getNome()+"\n"+
                           "|| CATEGORIA: "+this.getCategoria()+"\n"+
                           "|| VITÓRIAS: "+this.getVitorias()+"\n"+
                           "++-------------------------------------------------++");
    }
    //===============================================================================
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    //===============================================================================
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    //===============================================================================
    public void empate(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
