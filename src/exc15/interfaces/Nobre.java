package exc15.interfaces;

import poo.lista3.exc15.classes.Conselheiro;
import poo.lista3.exc15.classes.Soldado;

public interface Nobre {
    Conselheiro conselheiro = new Conselheiro();
    Soldado[] soldados = new Soldado[10];

    void governar();
}
