package app;

import io.jooby.annotations.*;

@Path("/soma/{op1}/{op2}")
public class soma {

    @GET
    public double calcularSoma(@PathParam double op1 , @PathParam double op2) {
        double resultado = op1+op2;
       
        return resultado;
    }
}

