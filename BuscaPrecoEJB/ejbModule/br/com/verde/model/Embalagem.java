package br.com.verde.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PCEMBALAGEM database table.
 * 
 */
@Entity
@Table(name="PCEMBALAGEM")
@NamedQuery(name="Embalagem.findAll", query="SELECT e FROM Embalagem e")
@XmlRootElement
public class Embalagem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmbalagemPK id;

	private String bebalcoolica;

	private BigDecimal codprod;

	private String controlevasilhame;

	private String descricaoecf;

	private String destinoofertaatac;

	private String destinoofertavarejo;

	@Temporal(TemporalType.DATE)
	private Date dtinativo;

	@Temporal(TemporalType.DATE)
	private Date dtofertaatacfim;

	@Temporal(TemporalType.DATE)
	private Date dtofertaatacini;

	@Temporal(TemporalType.DATE)
	private Date dtofertafim;

	@Temporal(TemporalType.DATE)
	private Date dtofertaini;

	@Temporal(TemporalType.DATE)
	private Date dtultaltpvenda;

	private String embalagem;

	private String enviabalanca;

	private String enviafrentecaixa;

	private BigDecimal fatorpreco;

	private String gtinvalido;

	private String imprimerestaurante;

	private String obrigaleituracodbarra;

	private String obs;

	private BigDecimal pcomrep1;

	private BigDecimal perdesccartaofidelidade;

	private String permitemultiplicacao;

	private BigDecimal pervariacaoptabela;

	private BigDecimal pesobruto;

	private BigDecimal pesoliq;

	private BigDecimal poferta;

	private BigDecimal pofertaatac;

	private BigDecimal precoanterioratac;

	private String produtocozinha;

	private BigDecimal ptabela;

	private BigDecimal ptabelaatac;

	private BigDecimal pvenda;

	private BigDecimal pvendaatac;

	private BigDecimal qtfixamultipliccheckout;

	private BigDecimal qtmaxvenda;

	private BigDecimal qtminimaatacado;

	private BigDecimal qtminimaatacadof;

	private BigDecimal qtmultipla;

	private BigDecimal qtunit;

	private BigDecimal tempoalerta;

	private BigDecimal tempopreparo;

	private String tipoembalagem;

	private String unidade;

	private String usaetiquetaantifurto;

	private String usarestaurante;

	public Embalagem() {
	}

	public EmbalagemPK getId() {
		return this.id;
	}

	public void setId(EmbalagemPK id) {
		this.id = id;
	}

	public String getBebalcoolica() {
		return this.bebalcoolica;
	}

	public void setBebalcoolica(String bebalcoolica) {
		this.bebalcoolica = bebalcoolica;
	}

	public BigDecimal getCodprod() {
		return this.codprod;
	}

	public void setCodprod(BigDecimal codprod) {
		this.codprod = codprod;
	}

	public String getControlevasilhame() {
		return this.controlevasilhame;
	}

	public void setControlevasilhame(String controlevasilhame) {
		this.controlevasilhame = controlevasilhame;
	}

	public String getDescricaoecf() {
		return this.descricaoecf;
	}

	public void setDescricaoecf(String descricaoecf) {
		this.descricaoecf = descricaoecf;
	}

	public String getDestinoofertaatac() {
		return this.destinoofertaatac;
	}

	public void setDestinoofertaatac(String destinoofertaatac) {
		this.destinoofertaatac = destinoofertaatac;
	}

	public String getDestinoofertavarejo() {
		return this.destinoofertavarejo;
	}

	public void setDestinoofertavarejo(String destinoofertavarejo) {
		this.destinoofertavarejo = destinoofertavarejo;
	}

	public Date getDtinativo() {
		return this.dtinativo;
	}

	public void setDtinativo(Date dtinativo) {
		this.dtinativo = dtinativo;
	}

	public Date getDtofertaatacfim() {
		return this.dtofertaatacfim;
	}

	public void setDtofertaatacfim(Date dtofertaatacfim) {
		this.dtofertaatacfim = dtofertaatacfim;
	}

	public Date getDtofertaatacini() {
		return this.dtofertaatacini;
	}

	public void setDtofertaatacini(Date dtofertaatacini) {
		this.dtofertaatacini = dtofertaatacini;
	}

	public Date getDtofertafim() {
		return this.dtofertafim;
	}

	public void setDtofertafim(Date dtofertafim) {
		this.dtofertafim = dtofertafim;
	}

	public Date getDtofertaini() {
		return this.dtofertaini;
	}

	public void setDtofertaini(Date dtofertaini) {
		this.dtofertaini = dtofertaini;
	}

	public Date getDtultaltpvenda() {
		return this.dtultaltpvenda;
	}

	public void setDtultaltpvenda(Date dtultaltpvenda) {
		this.dtultaltpvenda = dtultaltpvenda;
	}

	public String getEmbalagem() {
		return this.embalagem;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

	public String getEnviabalanca() {
		return this.enviabalanca;
	}

	public void setEnviabalanca(String enviabalanca) {
		this.enviabalanca = enviabalanca;
	}

	public String getEnviafrentecaixa() {
		return this.enviafrentecaixa;
	}

	public void setEnviafrentecaixa(String enviafrentecaixa) {
		this.enviafrentecaixa = enviafrentecaixa;
	}

	public BigDecimal getFatorpreco() {
		return this.fatorpreco;
	}

	public void setFatorpreco(BigDecimal fatorpreco) {
		this.fatorpreco = fatorpreco;
	}

	public String getGtinvalido() {
		return this.gtinvalido;
	}

	public void setGtinvalido(String gtinvalido) {
		this.gtinvalido = gtinvalido;
	}

	public String getImprimerestaurante() {
		return this.imprimerestaurante;
	}

	public void setImprimerestaurante(String imprimerestaurante) {
		this.imprimerestaurante = imprimerestaurante;
	}

	public String getObrigaleituracodbarra() {
		return this.obrigaleituracodbarra;
	}

	public void setObrigaleituracodbarra(String obrigaleituracodbarra) {
		this.obrigaleituracodbarra = obrigaleituracodbarra;
	}

	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public BigDecimal getPcomrep1() {
		return this.pcomrep1;
	}

	public void setPcomrep1(BigDecimal pcomrep1) {
		this.pcomrep1 = pcomrep1;
	}

	public BigDecimal getPerdesccartaofidelidade() {
		return this.perdesccartaofidelidade;
	}

	public void setPerdesccartaofidelidade(BigDecimal perdesccartaofidelidade) {
		this.perdesccartaofidelidade = perdesccartaofidelidade;
	}

	public String getPermitemultiplicacao() {
		return this.permitemultiplicacao;
	}

	public void setPermitemultiplicacao(String permitemultiplicacao) {
		this.permitemultiplicacao = permitemultiplicacao;
	}

	public BigDecimal getPervariacaoptabela() {
		return this.pervariacaoptabela;
	}

	public void setPervariacaoptabela(BigDecimal pervariacaoptabela) {
		this.pervariacaoptabela = pervariacaoptabela;
	}

	public BigDecimal getPesobruto() {
		return this.pesobruto;
	}

	public void setPesobruto(BigDecimal pesobruto) {
		this.pesobruto = pesobruto;
	}

	public BigDecimal getPesoliq() {
		return this.pesoliq;
	}

	public void setPesoliq(BigDecimal pesoliq) {
		this.pesoliq = pesoliq;
	}

	public BigDecimal getPoferta() {
		return this.poferta;
	}

	public void setPoferta(BigDecimal poferta) {
		this.poferta = poferta;
	}

	public BigDecimal getPofertaatac() {
		return this.pofertaatac;
	}

	public void setPofertaatac(BigDecimal pofertaatac) {
		this.pofertaatac = pofertaatac;
	}

	public BigDecimal getPrecoanterioratac() {
		return this.precoanterioratac;
	}

	public void setPrecoanterioratac(BigDecimal precoanterioratac) {
		this.precoanterioratac = precoanterioratac;
	}

	public String getProdutocozinha() {
		return this.produtocozinha;
	}

	public void setProdutocozinha(String produtocozinha) {
		this.produtocozinha = produtocozinha;
	}

	public BigDecimal getPtabela() {
		return this.ptabela;
	}

	public void setPtabela(BigDecimal ptabela) {
		this.ptabela = ptabela;
	}

	public BigDecimal getPtabelaatac() {
		return this.ptabelaatac;
	}

	public void setPtabelaatac(BigDecimal ptabelaatac) {
		this.ptabelaatac = ptabelaatac;
	}

	public BigDecimal getPvenda() {
		return this.pvenda;
	}

	public void setPvenda(BigDecimal pvenda) {
		this.pvenda = pvenda;
	}

	public BigDecimal getPvendaatac() {
		return this.pvendaatac;
	}

	public void setPvendaatac(BigDecimal pvendaatac) {
		this.pvendaatac = pvendaatac;
	}

	public BigDecimal getQtfixamultipliccheckout() {
		return this.qtfixamultipliccheckout;
	}

	public void setQtfixamultipliccheckout(BigDecimal qtfixamultipliccheckout) {
		this.qtfixamultipliccheckout = qtfixamultipliccheckout;
	}

	public BigDecimal getQtmaxvenda() {
		return this.qtmaxvenda;
	}

	public void setQtmaxvenda(BigDecimal qtmaxvenda) {
		this.qtmaxvenda = qtmaxvenda;
	}

	public BigDecimal getQtminimaatacado() {
		return this.qtminimaatacado;
	}

	public void setQtminimaatacado(BigDecimal qtminimaatacado) {
		this.qtminimaatacado = qtminimaatacado;
	}

	public BigDecimal getQtminimaatacadof() {
		return this.qtminimaatacadof;
	}

	public void setQtminimaatacadof(BigDecimal qtminimaatacadof) {
		this.qtminimaatacadof = qtminimaatacadof;
	}

	public BigDecimal getQtmultipla() {
		return this.qtmultipla;
	}

	public void setQtmultipla(BigDecimal qtmultipla) {
		this.qtmultipla = qtmultipla;
	}

	public BigDecimal getQtunit() {
		return this.qtunit;
	}

	public void setQtunit(BigDecimal qtunit) {
		this.qtunit = qtunit;
	}

	public BigDecimal getTempoalerta() {
		return this.tempoalerta;
	}

	public void setTempoalerta(BigDecimal tempoalerta) {
		this.tempoalerta = tempoalerta;
	}

	public BigDecimal getTempopreparo() {
		return this.tempopreparo;
	}

	public void setTempopreparo(BigDecimal tempopreparo) {
		this.tempopreparo = tempopreparo;
	}

	public String getTipoembalagem() {
		return this.tipoembalagem;
	}

	public void setTipoembalagem(String tipoembalagem) {
		this.tipoembalagem = tipoembalagem;
	}

	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getUsaetiquetaantifurto() {
		return this.usaetiquetaantifurto;
	}

	public void setUsaetiquetaantifurto(String usaetiquetaantifurto) {
		this.usaetiquetaantifurto = usaetiquetaantifurto;
	}

	public String getUsarestaurante() {
		return this.usarestaurante;
	}

	public void setUsarestaurante(String usarestaurante) {
		this.usarestaurante = usarestaurante;
	}

}