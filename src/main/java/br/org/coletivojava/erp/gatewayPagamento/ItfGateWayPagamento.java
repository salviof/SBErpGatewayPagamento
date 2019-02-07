/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;

/**
 *
 * @author novy
 */
public interface ItfGateWayPagamento {

    public ItfResposta gerarTokenAcesso(String... parametros);

    public ItfResposta autorizarTransacao(double valor, String... parametros);

    public ItfResposta cancelarTransacao(String token);

    public ItfResposta capturarTransacao(String pCodigoTransacao);

    public ItfResposta obterDadosTransacao(String parametro);

}
