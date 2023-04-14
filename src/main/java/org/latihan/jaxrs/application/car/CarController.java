package org.latihan.jaxrs.application.car;

import org.latihan.jaxrs.util.MyResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/car")
public class CarController {
    @GET
    @Path("/toyota")
    @Produces(MediaType.APPLICATION_JSON)
    public Response toyotaCar() {
        return MyResponse.build(true, 9000, "Welcome in Toyota Showroom");
    }
}
