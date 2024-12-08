package archivoBinario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AñadirContenido extends ObjectOutputStream {

    //constructor para que herede los atributos del ObjectOutputStream de escritura
    public AñadirContenido(OutputStream out) throws IOException {
        super(out);
    }
    public AñadirContenido() throws  IOException, SecurityException{

    }

    //metodo para que se guarden los objetos que quiera(se resetea la cabecera del archivo bibario)
    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
