package org.latihan.jaxrs.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/myresource")
public class MyResource {

    @GET
    public Response get() {
        boolean isSuccess = true;
        int responseCode = 200;
        String message = "Hello, world!";
        return MyResponse.build(isSuccess, responseCode, message);
    }

}