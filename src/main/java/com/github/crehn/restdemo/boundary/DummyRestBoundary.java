package com.github.crehn.restdemo.boundary;

//import static com.github.crehn.builtinboast.RestConstants.*;

import javax.ejb.Stateless;
import javax.ws.rs.*;

import lombok.extern.slf4j.Slf4j;

import com.github.crehn.restdemo.data.ResultObject;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Slf4j
@Stateless
@Path("/dummy")
@Api(value = "/dummy", description = "Various dummy operations")
public class DummyRestBoundary {
	
	@GET
	@Path("/hello/{name}/")
	@ApiOperation("say hello")
	public String sayHelloTo(@PathParam("name") String name) {
		log.info("sayHelloTo: [{}]", name);
		
		return "\"Hello " + name + "\"";
	}
	
	@GET
	@Path("/objects/{s}")
	@ApiOperation(value = "Returns a complex objects for a string", response = ResultObject.class, produces = "")//JSON_XML_AND_PLAIN)
			public
			ResultObject returnObject(@PathParam("s") String s) {
		log.info("called returnObject with parameter [{}]", s);
		
		ResultObject result = new ResultObject(s);
		
		log.info("returnObject with parameter [{}] returns {}", s, result);
		return result;
	}
	
}
