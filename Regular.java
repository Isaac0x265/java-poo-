// Classe Regular derivado da classe Aluno
public class Regular extends Aluno implements PagarMensalidade {
    
    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }
    
    @Override
    public void PagarMensalidade() {
        System.out.println(nome + "Pagar a Mensalidade")
    }
}