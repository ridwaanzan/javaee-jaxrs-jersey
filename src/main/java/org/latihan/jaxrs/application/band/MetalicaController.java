package org.latihan.jaxrs.application.band;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/band")
public class MetalicaController {
    @GET
    @Path("/metalica")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayMetal() {
        return Response.status(Response.Status.OK)
                .entity("Metalica Bands")
                .build();
    }
}
