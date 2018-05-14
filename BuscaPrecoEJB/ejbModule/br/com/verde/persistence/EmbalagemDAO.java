package br.com.verde.persistence;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.verde.model.Embalagem;
import br.com.verde.model.EmbalagemPK;

@RequestScoped
public class EmbalagemDAO implements IntfEmbalagemDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see br.com.verde.persistence.IntfEmbalagemDAO#findByPk(br.com.verde.model.EmbalagemPK)
	 */
	@Override
	public Embalagem findByPk(EmbalagemPK embalagemPK) {
		return entityManager.find(Embalagem.class, embalagemPK);
	}
	
	/* (non-Javadoc)
	 * @see br.com.verde.persistence.IntfEmbalagemDAO#listAll(int, int)
	 */
	@Override
	public List<Embalagem> listAll(int pagina, int qtdItens) {
		return entityManager.createNamedQuery("Embalagem.findAll", Embalagem.class)
				.setFirstResult(pagina * qtdItens - qtdItens).setMaxResults(qtdItens)
				.getResultList();
	}
}