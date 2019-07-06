package model;
public class Usuario {
    private String nome;
    private String senha;
    private int cont = 0;
    private boolean block = false;

    public String autenticar(String nome, String senha){
        if ( this.cont < 2 ) {
            this.nome = nome; this.senha = senha; this.cont = this.cont + 1;
        } else {
            this.nome = null; this.senha = null; this.block = true;
        }
        return null;
    }

    public int getCont(){
        return this.cont;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public boolean block(){
        return this.block;
    }
}