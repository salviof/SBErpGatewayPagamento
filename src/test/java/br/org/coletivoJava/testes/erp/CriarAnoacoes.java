/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.testes.erp;

import br.org.coletivojava.erp.gatewayPagamento.plataformas.ERPGatewayPagamento;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import org.apache.logging.log4j.LogManager;
import org.coletivojava.fw.api.objetoNativo.log.LogPadraoSB;
import org.junit.Test;
import testes.geradorCodigo.erp.GeradorAPIERP;

/**
 *
 * @author desenvolvedor
 */
public class CriarAnoacoes {

    @Test
    public void criarAnotacoes() {

        try {
            SBCore.configurar(new ConfigCoreApiErpGatewayPagamento(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
            for (ERPGatewayPagamento trassp : ERPGatewayPagamento.values()) {

                GeradorAPIERP gerador = new GeradorAPIERP(trassp);
                gerador.salvarEmDiretorioPadraoSubstituindoAnterior();
            }
        } catch (Throwable t) {
            LogManager.getLogger(LogPadraoSB.class).error("Erro Criando anotações", t);
        }
    }

}
