package br.com.verde.servlet;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.verde.exception.ParametroInvalidoException;
import br.com.verde.model.Embalagem;
import br.com.verde.model.EmbalagemPK;
import br.com.verde.service.EmbalagemService;

@RequestScoped
@Path("/Produtos")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class BuscaPrecoServlet {
	
	@Inject
	private EmbalagemService embalagemService;

	@GET
	@Path("/{id:[0-9][0-9]*}")
	public Response findById(@PathParam("id") final Long id) {
		EmbalagemPK embalagemPK = new EmbalagemPK();
		embalagemPK.setCodauxiliar(id);
		embalagemPK.setCodfilial("1");
		Embalagem embalagem = null;
		try {
			embalagem = embalagemService.findByPk(embalagemPK );
		} catch (ParametroInvalidoException e) {
			return Response.status(Status.BAD_REQUEST).entity(e).build();
		}
		if (embalagem == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok(embalagem).build();
	}

	@GET
	public List<Embalagem> listAll(@DefaultValue("1") @QueryParam("start") final Integer startPosition,
			@DefaultValue("10") @QueryParam("max") final Integer maxResult) throws ParametroInvalidoException {
		List<Embalagem> embalagems;
		embalagems = embalagemService.listAll(startPosition, maxResult);
		return embalagems;
	}

}
