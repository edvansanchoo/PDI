package br.com.project.rh.model;

import br.com.project.rh.ValidationException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {
    private DadosPessoais dadosPessoais;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome,cpf, cargo);
        this.salario = salario;
    }

    public void atualizaSalario(BigDecimal novoSalario){
        this.salario = novoSalario;
        this.dataUltimoReajuste = LocalDate.now();
    }


    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void promover(Cargo novoCargo) {
        this.dadosPessoais.setCargo(novoCargo);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }
}
