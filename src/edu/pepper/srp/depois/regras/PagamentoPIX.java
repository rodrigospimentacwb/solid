package edu.pepper.srp.depois.regras;

import edu.pepper.srp.depois.Venda;

public class PagamentoPIX implements RegraDeDesconto {

    @Override
    public Double calcula(Venda venda) {
        return (venda.getValorTotal() * 15.0)/100;
    }
}
