/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivojava.erp.gatewayPagamento;

import br.org.coletivojava.erp.gatewayPagamento.bandeira.ItfBandeiraCartao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.Date;

/**
 *
 * @author novy
 */
public interface ItfCartaoDeCredito extends ItfBeanSimples {

    public String getToken();

    public void setToken(String token);

    public String getNumeroTransientGeracaoToken();

    public void setNumeroTransientGeracaoToken(String pNumeroTransient);

    public ItfBandeiraCartao getBandeira();

    public void setBandeira(ItfBandeiraCartao bandeira);

    public String getFinalCartao();

    public void setFinalCartao(String finalCartao);

    public String getNomeUsuario();

    public void setNomeUsuario(String nomeUsuario);

    public String getValidadeCartao();

    public void setValidadeCartao(String validadeCartao);

    public Date getDataHoraCriou();

    public void setDataHoraCriou(Date dataHoraCriou);

    public String getTipoCartao();

    public void setTipoCartao(String tipoCartao);

    public String getRespostaCielo();

    public void setRespostaCielo(String respostaCielo);

}
