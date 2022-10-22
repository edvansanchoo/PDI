package br.com.project.rh.service;

import br.com.project.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
