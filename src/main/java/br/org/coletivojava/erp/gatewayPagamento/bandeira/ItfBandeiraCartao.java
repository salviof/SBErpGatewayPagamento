/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento.bandeira;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabrica;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeVinculadoAEnum;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoTemIcone;

/**
 *
 * @author novy
 */
public interface ItfBandeiraCartao extends ComoEntidadeSimples, ComoTemIcone, ComoEntidadeVinculadoAEnum {

    @Override
    public default String getSlugIdentificador() {
        return getEnumVinculado().toString();
    }

}
