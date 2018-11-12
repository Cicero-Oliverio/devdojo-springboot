package br.com.devdojo.awesome.model.model;

public class Student {


    private String nome;

    public Student(String nome) {
        this.nome = nome;
    }

    public Student() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
