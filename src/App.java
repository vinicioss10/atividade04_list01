import java.util.Scanner;

/*Faça um Programa que peça as 4 notas bimestrais e mostre a média */

public class App {
    public static void main(String[] args) throws Exception {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;
        double media;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("Qual a nota do primeiro bimestre? ");
        nota1 = dig.nextInt();
        System.out.println("Qual a nota do segundo bimestre? ");
        nota2 = dig.nextInt();
        System.out.println("Qual a nota do terceiro bimestre? ");
        nota3 = dig.nextInt();
        System.out.println("Qual a nota do quarto bimestre? ");
        nota4 = dig.nextInt();

        soma = nota1 + nota2 + nota3 + nota4;
        media = soma / 4;
        System.out.println("A media final desse aluno é:" + media);

    }
}
