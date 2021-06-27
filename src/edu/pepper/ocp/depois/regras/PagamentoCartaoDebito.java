package edu.pepper.ocp.depois.regras;

import edu.pepper.ocp.depois.Venda;

public class PagamentoCartaoDebito implements RegraDeDesconto {

    @Override
    public Double calcula(Venda venda) {
        return (venda.getValorTotal() * 10.0)/100;
    }
}
