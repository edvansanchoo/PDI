package br.com.project.rh.service;

import br.com.project.rh.ValidationException;
import br.com.project.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {
    public void reajusteSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0){
            throw new ValidationException("Reajuste nao pode ser superior a 40% do salarios");
        }
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcionario.atualizaSalario(salarioReajustado);
    }
}
