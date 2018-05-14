package br.com.verde.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ParametroInvalidoException extends Exception {

	private static final long serialVersionUID = -7790379785879602008L;
	private final static String MENSAGEM = "Os parâmetros de busca informados são inválidos.";
	
	private String mensagem;
	
	public ParametroInvalidoException() {
		super(MENSAGEM);
		setMensagem(MENSAGEM);
	}

	public ParametroInvalidoException(Throwable cause) {
		super(MENSAGEM, cause);
		setMensagem(MENSAGEM);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}