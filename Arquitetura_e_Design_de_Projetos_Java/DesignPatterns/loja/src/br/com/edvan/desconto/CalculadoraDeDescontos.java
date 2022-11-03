package br.com.edvan.desconto;

import br.com.edvan.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);

    }
}
