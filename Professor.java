// Classe Professor derivado da classe Pessoa

public class Professor extends Pessoa implements darAula {
    private String centro;

    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    @Override
    public void darAula() {
        System.out.println("Dar a Aula" + nome)
    }
}