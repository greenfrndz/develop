package com.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class Store {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String send(){
		return "Rest Easy Sample";
	}

	@Path("/p")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String psend(){
		return "<h2>This is plain text, but returning with html tags.</h2>";
	}
	
	@GET
	@Path("/h")
	@Produces(MediaType.TEXT_HTML)
	public String hsend(){
		return "<h2 style='color:red;'>Hi</h2>";
	}
	
	@GET
	@Path("x")
	@Produces(MediaType.TEXT_XML)
	public String xsend(){
		return "<id>111</id>";
	}
}
