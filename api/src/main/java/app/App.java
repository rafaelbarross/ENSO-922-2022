package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc (new Multiplicacao());
    mvc (new divisao());
    mvc(new soma());
    mvc (new sub());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}

