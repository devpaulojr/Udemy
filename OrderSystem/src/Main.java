import java.util.Scanner;
import java.util.Locale;

import enumeracao.NivelDeContratacao;
import entidades.Departamento;
import entidades.Pedido;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // dados do usuário

        System.out.print("Digite o nome do departamento: ");
        String departamentoNome = sc.nextLine();

        System.out.println("Digite o dados do trabalhador: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Senioridade: ");
        String senioridade = sc.nextLine();

        System.out.print("Digite seu salario base: ");
        Double salarioLiquido = sc.nextDouble();

        Pedido pedido = new Pedido(new Departamento(departamentoNome), nome, NivelDeContratacao.valueOf(senioridade),
                salarioLiquido);


        // Quantidade de contratos digitado pelo usuário

        int quantidadeContrato = sc.nextInt();

        for(int line = 0; line < quantidadeContrato; quantidadeContrato ++){
            System.out.println("Digite os dados do " + (line+1) + "° contrato: ");

            System.out.print("Data do contrato (DD/MM/YYYY): ");
            System.out.print("Valor por hora: ");
            System.out.print("Duração (horas): ");
        }

        sc.close();

    }
}