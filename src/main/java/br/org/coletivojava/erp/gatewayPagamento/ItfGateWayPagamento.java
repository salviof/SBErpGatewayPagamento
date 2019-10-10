/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author novy
 */
public interface ItfGateWayPagamento {

    public ItfResposta gerarTokenAcesso(ItfCartaoDeCredito pCartao);

    public ItfResposta autorizarECapturarTransacaoComToken(double pValor, String pCodigoPedido, ItfCartaoDeCredito pCartao, String pDigitoVerificador, Map<String, String> dadoscomplementares);

    public ItfResposta autorizarTransacaoComToken(double pValor, String pCodigoPedido, ItfCartaoDeCredito pCartao, String pDigitoVerificador);

    public ItfResposta autorizarTransacaoFuturaComToken(Date pDataHora, double valor, String pCodigoPedido, String nomeUsuarioCartao, double pValorCompra, String pToken, String digitoVerificador, String pbandeira);

    public ItfResposta autorizarECapturarTransacaoComDadosTransiente(double pValor, String pCodigoPedido, ItfCartaoCreditoDadosTransient pCartao);

    public ItfResposta cancelarTransacao(String token);

    public ItfResposta capturarTransacao(String pCodigoTransacao, Double pValor);

    public default ItfResposta capturarTransacao(String pCodigoTransacao) {
        return capturarTransacao(pCodigoTransacao, null);
    }

    public ItfResposta obterDadosTransacao(String pCodigoTransacao);

}
