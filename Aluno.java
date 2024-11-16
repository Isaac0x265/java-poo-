// Classe Aluno derivado da classe Pessoa
public class Aluno extends Pessoa implements PagarMensalidade {
    private String matricula;

    public Aluno(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void PagarMensalidade() {
        System.out.println("Pagar a Mensalidade" + nome)
    }
}