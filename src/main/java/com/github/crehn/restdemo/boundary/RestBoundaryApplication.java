package com.github.crehn.restdemo.boundary;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * This class defines the rest boundary by specifying the resource classes. Note
 * that swagger is integrated here.
 */
public class RestBoundaryApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> resources = new HashSet<>();
		resources.add(com.wordnik.swagger.jaxrs.JaxrsApiReader.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
		resources.add(DummyRestBoundary.class);
		return resources;
	}
}
