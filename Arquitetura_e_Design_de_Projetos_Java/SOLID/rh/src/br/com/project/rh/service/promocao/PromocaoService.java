package br.com.project.rh.service.promocao;

import br.com.project.rh.ValidationException;
import br.com.project.rh.model.Cargo;
import br.com.project.rh.model.Funcionario;

public class PromocaoService {
    public void promover(Funcionario funcionario, Boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidationException("Gerentes não podem ser promovidos ");
        }
        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else {
            throw new ValidationException("Funcionario não bateu a meta");
        }
    }
}
