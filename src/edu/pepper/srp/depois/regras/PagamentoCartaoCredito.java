package edu.pepper.srp.depois.regras;

import edu.pepper.srp.depois.Venda;

public class PagamentoCartaoCredito implements RegraDeDesconto {

    @Override
    public Double calcula(Venda venda) {
        return (venda.getValorTotal() * 2.0)/100;
    }
}
