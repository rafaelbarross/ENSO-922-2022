package app;

import io.jooby.annotations.*;


@Path("/Soma/{op1}/{op2}")
public class Soma {

    @GET
    public double calculaSoma(@PathParam double op1 , @PathParam double op2 ) {
        double resultado = op1+op2;
        return resultado;
    }
}
