import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

import entidades.HorasContratadas;
import enumeracao.NivelDeContratacao;
import entidades.Departamento;
import entidades.Pedido;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        // dados do usuário

        System.out.print("Digite o nome do departamento: ");
        String departamentoNome = sc.nextLine();

        System.out.println("Digite o dados do trabalhador: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Senioridade: ");
        String senioridade = sc.nextLine();

        System.out.print("Digite seu salario base: R$ ");
        Double salarioLiquido = sc.nextDouble();

        Pedido pedido = new Pedido(new Departamento(departamentoNome), nome, NivelDeContratacao.valueOf(senioridade),
                salarioLiquido);


        // Quantidade de contratos digitado pelo usuário

        System.out.print("Digite a quantidade de contratos: ");
        int quantidadeContrato = sc.nextInt();


        int contador = 1;

        for(int line = 0; line < quantidadeContrato; line ++){
            System.out.println("Digite os dados do " + (contador) + "° contrato: ");

            System.out.print("Data do contrato (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            Double valorHora = sc.nextDouble();

            System.out.print("Duração (horas): ");
            Integer duracaoHora = sc.nextInt();

            HorasContratadas horasContratadas = new HorasContratadas(dataContrato, valorHora, duracaoHora);

            pedido.adicionarContrato(horasContratadas);

            contador ++;
        }

        // mês e ano dos contratos

        System.out.print("Digite o mês e ano do contrato para calcular a renda total: ");
        String mesContratoAnoContrato = sc.next();


        Integer mes = Integer.parseInt(mesContratoAnoContrato.substring(0, 2));
        Integer ano = Integer.parseInt(mesContratoAnoContrato.substring(3));


        //saida de dados geral
        System.out.println("\n");

        System.out.println("Nome do departamento: " + pedido.getDepartamento().getNome());
        System.out.println("Nome do usuário: " + pedido.getNome());
        System.out.println("nivel: " + pedido.getNivelDeContratacao());
        System.out.println("Renda do mês " + mesContratoAnoContrato + " R$ " + pedido.valorTotalRenda(ano, mes));

        sc.close();

    }
}