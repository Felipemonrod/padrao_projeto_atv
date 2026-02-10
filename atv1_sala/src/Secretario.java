public class Secretario extends Funcionario{
    public Secretario(String Secretario) {
        super("Secretario");
    }

    @Override
    public void calcSalario() {
        System.out.println("Salario Secretario");
    }
}
