public class Diretor extends Funcionario implements IAutenticacao{

    public Diretor(String Diretor) {
        super("Diretor");
    }

    public void login() {
        System.out.println("Login");
    }

    @Override
    public void calcSalario() {
        System.out.println("Calcula Salario");
    }
}
