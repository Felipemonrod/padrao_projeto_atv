public class Engenheiro extends Funcionario{
    public Engenheiro(String nome, String cpf, int idade, String Engenheiro) {
        super(nome, cpf, idade, "Engenheiro");
    }

    @Override
    public void calcSalario() {

    }

    @Override
    public void comissao() {
        System.out.println("Comissão");
    }
}
