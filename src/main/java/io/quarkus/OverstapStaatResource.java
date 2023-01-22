package io.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/overstapstaat")
public class OverstapStaatResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String overstapStaat() {
        return "OverstapStaat jaxrs";
    }
}
