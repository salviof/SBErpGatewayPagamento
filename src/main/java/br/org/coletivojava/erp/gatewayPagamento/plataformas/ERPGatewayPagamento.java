/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package br.org.coletivojava.erp.gatewayPagamento.plataformas;

import br.org.coletivojava.erp.gatewayPagamento.ItfGateWayPagamento;
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoDaFabrica;
import org.coletivojava.fw.utilCoreBase.UtilSBCoreReflexaoAPIERP;

/**
 *
 * @author desenvolvedor
 */
@ApiERPColetivoJavaFW(descricaoApi = "Gateway de Pagamento", nomeApi = "GatewayPagamento", slugInicial = "GatewayPgto")
public enum ERPGatewayPagamento implements ItfApiErpSuperBits<ItfGateWayPagamento> {

    @InfoObjetoDaFabrica(nomeObjeto = "Cielo", classeObjeto = PlataformaGatewayPagamento.class)
    CIELO,
    @InfoObjetoDaFabrica(nomeObjeto = "Pague Seguro", classeObjeto = PlataformaGatewayPagamento.class)
    PAGUE_SEGURO,
    @InfoObjetoDaFabrica(nomeObjeto = "Bitcoin", classeObjeto = PlataformaGatewayPagamento.class)
    BIT_COINS,
    /**
     * O Modo automático se vira para encontrar o usuário, exemplo: se tiver uma
     * sessao do usuário conectada envia via modal, se não encontrar, tenta
     * watzap, se não encontrar, registra em notificações e envia um e-mail
     */
    @InfoObjetoDaFabrica(nomeObjeto = "Automático", classeObjeto = PlataformaGatewayPagamento.class)
    AUTOMATICO;

    @Override
    public ItfGateWayPagamento getImplementacaoDoContexto() {
        return (ItfGateWayPagamento) UtilSBCoreReflexaoAPIERP.getImplementacaoDoContexto(this);
    }

    @Override
    public Class getInterface() {
        return ItfGateWayPagamento.class;

    }

}
