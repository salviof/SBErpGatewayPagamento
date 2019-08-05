/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro.ItfPessoaFisicoJuridico;
import java.util.Date;

/**
 * @author salviofurbino
 * @since 18/07/2019
 * @version 1.0
 */
public interface ItfCartaoCreditoDadosTransientAntiFraude extends ItfCartaoCreditoDadosTransient, ItfPessoaFisicoJuridico {

    public String getHashComprador();

}
