package entidades;

import enumeracao.NivelDeContratacao;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Pedido {

    private String nome;
    private NivelDeContratacao nivelDeContratacao;
    private Double salarioBase;

    private Departamento departamento;
    List<HorasContratadas> contratos = new ArrayList<>(); // inicializada

    public Pedido(Departamento departamento){
    }

    public Pedido(Departamento departamento, String nome, NivelDeContratacao nivelDeContratacao, Double salarioBase){
        this.nome = nome;
        this.nivelDeContratacao = nivelDeContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome(){
        return nome;
    }

    public NivelDeContratacao getNivelDeContratacao(){
        return nivelDeContratacao;
    }

    public Double getSalarioBase(){
        return salarioBase;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public List<HorasContratadas> getContratos(){
        return contratos;
    }

    public void adicionarContrato(HorasContratadas contratadas){
        contratos.add(contratadas);
    }

    public void removerContrato(HorasContratadas contratadas){
        contratos.remove(contratadas);
    }

    public Double valorTotalRenda(Integer ano, Integer mes){
        Calendar calendario = Calendar.getInstance();
        Double soma = salarioBase;

        for(HorasContratadas linha : contratos){
            calendario.setTime(linha.getDataContrato());

            int anoContrato = calendario.get(Calendar.YEAR);
            int mesContrato = calendario.get(Calendar.MONTH) + 1;

            if(ano == anoContrato && mes == mesContrato){
                soma += linha.valorTotal();
            }
        }
        return soma;
    }

}
