public class Engenheiro extends Funcionario {
    public Engenheiro(String Engenheiro) {
        super("Engenheiro");
    }

    @Override
    public void calcSalario() {
        System.out.println("Salario do Engenheiro");
    }

    public void comissao(){
        System.out.println("Imprimer comissao");
    };
}
