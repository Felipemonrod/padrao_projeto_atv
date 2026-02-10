public class Gerente extends Funcionario{
    public Gerente(String Gerente) {
        super("Gerente");
    }

    @Override
    public void calcSalario() {
        System.out.println("Salario Gerente");
    }
}
