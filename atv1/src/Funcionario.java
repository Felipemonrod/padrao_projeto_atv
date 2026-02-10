public abstract class  Funcionario extends Pessoa implements  IDepartamento {
    public String cargo;

    public Funcionario(String nome, String cpf, int idade, String cargo) {
        super(nome, cpf, idade);
        this.cargo = cargo;
    }

    @Override
    public void departamentoPertencente() {
    }

    public abstract void calcSalario();

    public void comissao() {

    }
}
