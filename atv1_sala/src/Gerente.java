public class Gerente extends Funcionario implements IAutenticacao{
    public Gerente(String cargo) {
        super(cargo);
    }

    @Override
    public void calcSalario() {
        System.out.println("Salario Gerente");
    }

    @Override
    public void login() {

    }
}
