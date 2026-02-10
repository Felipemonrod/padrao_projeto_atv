public abstract class Funcionario {
    private String cargo;

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public abstract void calcSalario();
}
