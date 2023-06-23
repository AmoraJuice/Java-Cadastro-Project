import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private string name;
    private int idade;
    private int matricula;

    public Aluno(String name, int idade, int, int matricula) {
        this.name = name;
        this.idade = idade;
        this.matricula = matricula;
    }

    }
    public String getNome() {
        return name;
    }

    public void setName(String nome ) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula () {
        this.matricula = matricula;
    }
}
public class Cadastro {
    private static List<Aluno> listaAlunos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }
    public static void exibirMenu() {
        System.out.println ("---> Cadastro de Aluno <---");
        System.out.println ("1. Adicionar Aluno");
        System.out.println ("2. Visualizar Alunos");
        System.out.println ("3. Atualizar Aluno");
        System.out.println ("4. Excluir  Aluno");
        System.out.println ("0. Sair");
        System.out.println ("Escolha uma opção: ");
        int opcao = scaner.nextInt();


    }
}
