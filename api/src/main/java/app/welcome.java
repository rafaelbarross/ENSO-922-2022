package app;

import io.jooby.annotations.*;

@Path("/")
public class welcome {

    @GET
    public String BemVindo() {
        return "Seja bem-vindo!";
    }
}

