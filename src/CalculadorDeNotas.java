import java.util.Scanner;

public class CalculadorDeNotas {
    static void main(String[] args) {


        // Abre o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Usuário Escreve o nome
        System.out.println("Bem vindo(a) ao Calculador de notas, por favor digite o seu nome: ");
        String nome = caixaDeTexto.nextLine();
        System.out.println("Bem vindo " + nome + " Digite a sua n1: ");
        double nota = Double.parseDouble(caixaDeTexto.nextLine());
        System.out.println("Digite sua n2: ");
        double nota2 = Double.parseDouble(caixaDeTexto.nextLine());
        System.out.println("Digite sua nota do PPD/PIS: ");
        double pis = Double.parseDouble(caixaDeTexto.nextLine());
        double notaFinal = nota + nota2 + pis;

        //if e else pra saber se foi aprovado ou nn
        if (notaFinal >= 6.75) {
            System.out.println("Parabéns você foi aprovado na disciplina com a nota: " + notaFinal);
        } else {
            System.out.println("Infelizmente você está reprovado na disciplina, e terá que fazer a recuperação, sua nota foi: " + notaFinal);
        }
        
        //Fecha o Scanner
        caixaDeTexto.close();
    }
}
