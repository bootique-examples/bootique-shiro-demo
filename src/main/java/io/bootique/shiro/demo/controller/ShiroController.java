package io.bootique.shiro.demo.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("")
public class ShiroController {

    @GET
    @Path("pub")
    public String doSomething() {
        return "hello!";
    }

    @GET
    @Path("denied")
    public Response denied() {
        return Response.ok("permission denied").build();
    }

    @GET
    @Path("private")
    public Response privateEndpoint() {
        return Response.ok("admin").build();
    }
}
