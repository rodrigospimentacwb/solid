package edu.pepper.srp.depois.regras;

import edu.pepper.srp.depois.Venda;

public class PagamentoCartaoDebito implements RegraDeDesconto {

    @Override
    public Double calcula(Venda venda) {
        return (venda.getValorTotal() * 10.0)/100;
    }
}
