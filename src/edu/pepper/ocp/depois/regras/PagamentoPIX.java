package edu.pepper.ocp.depois.regras;

import edu.pepper.ocp.depois.Venda;

public class PagamentoPIX implements RegraDeDesconto {

    @Override
    public Double calcula(Venda venda) {
        return (venda.getValorTotal() * 15.0)/100;
    }
}
