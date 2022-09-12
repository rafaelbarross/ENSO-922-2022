package app;

import io.jooby.annotations.*;

@Path("/divi/{op1}/{op2}")
public class divisao {

    @GET
    public double calculardivi(@PathParam double op1 , @PathParam double op2) {
        double resultado = op1/op2;
        
        
        return resultado;
    }
}
