package entidades;

import java.util.Date;

public class HorasContratadas {

    private Date dataContrato;
    private Double valorPorHora;
    private Integer horas;

    public HorasContratadas(){
    }

    public HorasContratadas(Date dataContrato, Double valorPorHora, Integer horas){
        this.dataContrato = dataContrato;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public Date getDataContrato(){
        return dataContrato;
    }

    public Double getValorPorHora(){
        return valorPorHora;
    }

    public Integer getHoras(){
        return horas;
    }

    public Double valorTotal(){
        return valorPorHora * horas;
    }

}
