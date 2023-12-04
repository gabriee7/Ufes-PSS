
import model.Musica;
import model.TocadorMusica;
import state.ParadoState;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author nitro5WIN10
 */
public class Principal {

    public static void main(String[] args) {
        Musica musica = new Musica("sei la");
        TocadorMusica tocadorService = new TocadorMusica(new ParadoState());
        
        tocadorService.tocar(musica);
        tocadorService.pausar(musica);
        tocadorService.parar(musica);
    }
}
