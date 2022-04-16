package org.acme.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("rest")
public class endPoint {

    @Path("hello")
    @GET
    public String hello() {
        return "Hello, World!";
    }
}
