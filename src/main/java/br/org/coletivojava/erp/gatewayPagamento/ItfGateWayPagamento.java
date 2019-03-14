/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import java.util.Date;

/**
 *
 * @author novy
 */
public interface ItfGateWayPagamento {

    public ItfResposta gerarTokenAcesso(ItfCartaoDeCredito pCartao);

    public ItfResposta autorizarECapturarTransacaoComToken(double pValor, String pCodigoPedido, ItfCartaoDeCredito pCartao, String pDigitoVerificador);

    public ItfResposta autorizarTransacaoComToken(double pValor, String pCodigoPedido, ItfCartaoDeCredito pCartao, String pDigitoVerificador);

    public ItfResposta autorizarTransacaoFuturaComToken(Date pDataHora, double valor, String pCodigoPedido, String nomeUsuarioCartao, double pValorCompra, String pToken, String digitoVerificador, String pbandeira);

    public ItfResposta cancelarTransacao(String token);

    public ItfResposta capturarTransacao(String pCodigoTransacao);

    public ItfResposta obterDadosTransacao(String pCodigoTransacao);

}
