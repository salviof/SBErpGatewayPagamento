/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento.bandeira;

import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanComIcone;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanVinculadoAEnum;

/**
 *
 * @author novy
 */
public interface ItfBandeiraCartao extends ItfBeanSimples, ItfBeanComIcone, ItfBeanVinculadoAEnum {

    @Override
    public default String getSlugIdentificador() {
        return getEnumVinculado().toString();
    }

}
