package br.com.verde.provider;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.verde.exception.ParametroInvalidoException;

@Provider
@Produces({ "application/xml", "application/json" })
public class ParametroInvalidoExceptionProvider implements MessageBodyWriter<ParametroInvalidoException> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type.isAnnotationPresent(XmlRootElement.class) && type.isAssignableFrom(ParametroInvalidoException.class);
	}

	@Override
	public long getSize(ParametroInvalidoException t, Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType) {
		return -1;
	}

	@Override
	public void writeTo(ParametroInvalidoException target, Class<?> type, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(type);
			jaxbContext.createMarshaller().marshal(target, entityStream);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
		
	}

}
