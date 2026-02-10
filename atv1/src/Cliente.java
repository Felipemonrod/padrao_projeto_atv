public class Cliente extends Pessoa implements IFornecedor, IAutenticavel {
    public Cliente(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }


    @Override
    public void fornece() {

    }

    @Override
    public void nomeProduto() {

    }

    @Override
    public void login() {

    }
}
