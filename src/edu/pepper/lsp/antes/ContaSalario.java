package edu.pepper.lsp.antes;

public class ContaSalario extends ContaCorrenteComum {

    public void rende() {
        throw new Exception("Essa conta não possui rendimento");
        // Inclusive teria que modificar o método rende da ContaCorrenteComum para ter lançamento de Exeception
    }

}