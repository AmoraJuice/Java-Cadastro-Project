import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Getters e Setters (proteção)
class Aluno {
    private String name;
        private int idade;
            private int matricula;

    public Aluno(String name, int idade, int matricula) {
        this.name = name;
            this.idade = idade;
                this.matricula = matricula;
    }
    public String getName() {
        return name;
    }
    public void setName(String name ) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula (int matricula) {
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
                                System.out.println ("Escolha uma opcao: ");
                            int opcao = scanner.nextInt();
                        scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            adicionarAluno();
                        case 2:
                            visualizarAlunos();
                        case 3:
                            atualizarAluno();
                        case 4:
                            excluirAluno();
                        case 0:
                            System.out.println("Encerrando o programa...");
                            break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                            exibirMenu();
        }
    }

    private static void adicionarAluno(){
        System.out.println("--- Adicionar aluno ---");
            System.out.println("Nome: ");
                String name = scanner.nextLine();
                    System.out.println("Idade: ");
                        int idade = scanner.nextInt();
                            System.out.println("Matricula: ");
                            int matricula = scanner.nextInt();
                        Aluno aluno = new Aluno(name, idade, matricula);
                    listaAlunos.add(aluno);
                System.out.println("Aluno adicionado com sucesso!");
            exibirMenu();
    }
    private static void excluirAluno() {
        System.out.println("--- Exluir aluno ---");
            if (listaAlunos.isEmpty()) {
                System.out.println("Nenhum aluno cadastrado.");
        } else {
        System.out.println("Informe a matricula do aluno para ser removida");
        int matricula = scanner.nextInt();
            Aluno alunoEncontrado = null;
            for (Aluno aluno : listaAlunos) {
                if (aluno.getMatricula() == matricula) {
                    alunoEncontrado = aluno;
                    break;
            }
        }
        if (alunoEncontrado == null) {
            System.out.println("Nenhum aluno encontrado.");
        } else {
            listaAlunos.remove(alunoEncontrado);
            System.out.println("Aluno removido com sucesso!");
        }
    }










    }
    private static void visualizarAlunos() {
        System.out.println("--- Visualizar Alunos ---");
            if (listaAlunos.isEmpty()) {
                System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno aluno : listaAlunos) {
                    System.out.println("Nome: " + aluno.getName());
                System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("------------------------");
        }
    }
    exibirMenu();
    }

    private static void atualizarAluno() {

    }



}