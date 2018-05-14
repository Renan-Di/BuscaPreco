package br.com.verde.provider;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.verde.exception.ParametroInvalidoException;

@Provider
@Produces({ "application/xml", "application/json" })
public class ParametroInvalidoExceptionMapper implements ExceptionMapper<ParametroInvalidoException> {

	@Override
	public Response toResponse(ParametroInvalidoException exception) {
		return Response.status(Status.BAD_REQUEST).entity(exception).build();
	}

}