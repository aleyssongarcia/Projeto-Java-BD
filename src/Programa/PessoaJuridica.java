package Programa;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String name, String cnpj, String email) {
        super(name, cnpj, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getTipoPessoa() {
        return "Pessoa Jurídica";
    }
}
