// Classe Bolsista derivado da classe Aluno
public class Bolsista extends Aluno implements PagarMensalidade {
    
    public Bolsista(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }
    
    @Override
    public void PagarMensalidade() {
        System.out.println(nome + "Pagar a Mensalidade")
    }
}
