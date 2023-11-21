package Programa;

import java.util.Date;

import Utilitarios.Utils;

public abstract class Pessoa {

    private static int counter = 1;

    private int numeroPessoa;
    private String name;
    private String cpfCnpj;
    private String email;
    private Date accountCreationDate;

    public Pessoa() { }

    public Pessoa(String name, String cpfCnpj, String email) {
        this.numeroPessoa = Pessoa.counter;
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    public abstract String getTipoPessoa();

    @Override
    public String toString() {
        return  "\nTipo de Pessoa: " + getTipoPessoa() +
                "\nName: " + this.getName() +
                "\nCPF/CNPJ: " + this.getCpfCnpj() +
                "\nEmail: " + this.getEmail() +
                "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
    }
}
