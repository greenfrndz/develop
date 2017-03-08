package com.sample;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/args")
public class ParamDemo {
	
	@GET
	@Produces(MediaType.TEXT_HTML)	
	public String args(){
		return "<h3>Rest Easy - Giving args in url</h3>";
	}
	
	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudent(){
		Student s=new Student(121,"abcd","hyd");
		return  "{'friends': ['Michael', 'Tom', 'Daniel', 'John', 'Nick']}";
	}
	
	@Path("/matrix/{year}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String matrix(@PathParam("year") String year, @MatrixParam("author") String author,@MatrixParam("country") String country){
		return  "{'year':'"+year+"';'author':'"+author+"';'country':'"+country+"'}";
	}
	
	@Path("/formParam")
	@POST
	public Response formParam(@FormParam("uname")String name, @FormParam("address")String address){
		return Response.status(200)
						.entity("Name :"+name+"<br>Address :"+address)
						.build();
	}
	
}
