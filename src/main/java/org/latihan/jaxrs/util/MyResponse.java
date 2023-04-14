package org.latihan.jaxrs.util;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MyResponse {

    public static Response build(boolean isSuccess, int responseCode, String message) {
        String json = String.format("{\"isSuccess\":%s,\"responseCode\":%d,\"message\":\"%s\"}", isSuccess, responseCode, message);
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
    
}