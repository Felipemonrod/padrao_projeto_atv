public class Gerente extends Funcionario implements IAutenticavel{
    public Gerente(String nome, String cpf, int idade, String Gerente) {
        super(nome, cpf, idade, "Gerente");
    }

    @Override
    public void calcSalario() {

    }
    @Override
    public void login() {
    }
}
