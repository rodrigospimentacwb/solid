package edu.pepper.srp.depois.regras;

public enum TipoPagamentoEnum {

    CARTAO_CREDITO(new PagamentoCartaoCredito()),
    CARTAO_DEBITO(new PagamentoCartaoDebito()),
    DINHEIRO(new PagamentoDinheiro()),
    PIX(new PagamentoPIX());

    private RegraDeDesconto regra;

    TipoPagamentoEnum(RegraDeDesconto regra){
        this.regra = regra;
    }

    public RegraDeDesconto getRegra() {
        return regra;
    }

}
