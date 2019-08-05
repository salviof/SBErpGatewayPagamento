/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento;

/**
 * @author salviofurbino
 * @since 21/07/2019
 * @version 1.0
 */
public interface ItfCartaoCreditoDadosTransient extends ItfCartaoDeCredito {

    public String getNumeroCartao();

    public String getNomeUsuarioCartao();

    public String getDigitoVerificador();

}
