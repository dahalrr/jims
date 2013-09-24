package in.biconsoft.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * Scope discussion here
 * http://jersey.576304.n2.nabble.com/Spring-framework-support-for-Jersey-2-td7580673.html
 */
@Path("/user")
@Singleton
public class Hello {
	@Autowired
	public String abc;

	@GET	
	@Path("/hey")
	@Produces(MediaType.TEXT_HTML)
	public Response topQueriesXml() {
			return Response.status(Status.ACCEPTED).entity("jims says hello to you !!")
				.build();
	}
}
