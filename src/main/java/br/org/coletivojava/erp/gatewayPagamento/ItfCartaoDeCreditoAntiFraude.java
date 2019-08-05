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
 * @since 21/07/2019
 * @version 1.0
 */
public interface ItfCartaoDeCreditoAntiFraude extends ItfPessoaFisicoJuridico {

    public Date getAniversario();

    public String getRazaoSocial();

    public void setRazaoSocial(String razaoSocial);

    public String getDocumentoCPF();

    public String getDocumentoCNPJ();

    public boolean isUmCartaoEmpresarial();

    public String getPin();
}
