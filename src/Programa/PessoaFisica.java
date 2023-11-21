package Programa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String name, String cpf, String email) {
        super(name, cpf, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getTipoPessoa() {
        return "Pessoa Física";
    }
}

