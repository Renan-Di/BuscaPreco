package br.com.verde.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.verde.exception.ParametroInvalidoException;
import br.com.verde.model.Embalagem;
import br.com.verde.model.EmbalagemPK;
import br.com.verde.persistence.IntfEmbalagemDAO;

/**
 * Session Bean implementation class EmbalagemService
 */
@Stateless(mappedName = "EmbalagemService")
@LocalBean
public class EmbalagemService {

    @Inject
    private IntfEmbalagemDAO embalagemDAO;

	public Embalagem findByPk(EmbalagemPK embalagemPK) throws ParametroInvalidoException {
		boolean invalido = false;
		
		try {
		invalido = !(embalagemPK instanceof EmbalagemPK
				&& embalagemPK.getCodauxiliar() > 0
				&& embalagemPK.getCodfilial() instanceof String
				&& Integer.valueOf(embalagemPK.getCodfilial()) instanceof Integer);
		} catch (Exception e) {
			throw new ParametroInvalidoException(e);
		}
		
		if (invalido) {
			throw new ParametroInvalidoException();
		}
		return embalagemDAO.findByPk(embalagemPK);
	}

	public List<Embalagem> listAll(int pagina, int qtdItens) throws ParametroInvalidoException {
		if (pagina <= 0 || qtdItens <=0) {
			throw new ParametroInvalidoException();
		}
		return embalagemDAO.listAll(pagina, qtdItens);
	}

}
