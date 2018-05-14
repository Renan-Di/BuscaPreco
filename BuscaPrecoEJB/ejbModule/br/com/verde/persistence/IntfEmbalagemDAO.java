package br.com.verde.persistence;

import java.util.List;

import br.com.verde.model.Embalagem;
import br.com.verde.model.EmbalagemPK;

public interface IntfEmbalagemDAO {

	Embalagem findByPk(EmbalagemPK embalagemPK);

	List<Embalagem> listAll(int pagina, int qtdItens);

}