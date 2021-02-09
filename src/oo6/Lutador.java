package oo6;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    //getters setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public void setCategoria() {
        if(this.getPeso()<52.2){
            this.categoria ="CATEGORIA INVÁLIDA";
        }else if(this.getPeso()<=70.3){
            this.categoria = "LEVE";
        }else if(this.getPeso()<=83.9){
            this.categoria = "MÉDIO";
        }else if(this.getPeso()<=120.9){
            this.categoria = "PESADO";
        }else 
            this.categoria = "CATEGORIA INVÁLIDA";
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
    
    
    // metodos
    
    public void apresentar(){
        System.out.println("====================================================");
        System.out.println("-------------------APRESENTAÇÃO---------------------");
        System.out.println("====================================================");
        System.out.println("LUTADOR: "+this.getNome()+"\nORIGEM: "+this.getNacionalidade()+
                "\n"+this.getIdade()+" ANOS\n"+this.getAltura()+
                " METROS\n"+"PESANDO: "+this.getPeso()+" KG"+"\nGANHOU: "+this.getVitorias()+
                "\nPERDEU: "+this.getDerrotas()+"\nEMPATOU: "+this.getEmpates());
        System.out.println("====================================================");
    }
    
    public void status(){
        System.out.println("====================================================");
        System.out.println(this.getNome()+", É UM PESO "+this.getCategoria()+", COM "
                +this.getVitorias()+" VITÓRIAS");
        System.out.println("====================================================");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
}
