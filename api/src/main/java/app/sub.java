package app;

import io.jooby.annotations.*;

@Path("/sub/{op1}/{op2}")
public class sub {

    @GET
    public double calcularsub(@PathParam double op1 , @PathParam double op2) {
        double result = op1 - op2;
        return result;
    }
}
