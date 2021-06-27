package edu.pepper.srp.antes;

import java.util.List;

public class Venda {

    private Integer idVenda;
    private Integer compradorId;
    private List<Integer> itensId;
    private Double valorTotal;
    private Double valorDesconto;

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(Integer compradorId) {
        this.compradorId = compradorId;
    }

    public List<Integer> getItensId() {
        return itensId;
    }

    public void setItensId(List<Integer> itensId) {
        this.itensId = itensId;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double calculaDescontoDebito(){
        return (valorTotal * 10.0)/100;
    }

    public Double calculaDescontoCredito(){
        return (valorTotal * 2.0)/100;
    }
}
