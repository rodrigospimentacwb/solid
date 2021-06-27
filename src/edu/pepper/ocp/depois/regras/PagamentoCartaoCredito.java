package edu.pepper.ocp.depois.regras;

import edu.pepper.ocp.depois.Venda;

public class PagamentoCartaoCredito implements RegraDeDesconto {

    @Override
    public Double calcula(Venda venda) {
        return (venda.getValorTotal() * 2.0)/100;
    }
}
