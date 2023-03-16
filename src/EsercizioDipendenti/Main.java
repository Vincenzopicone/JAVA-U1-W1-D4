package EsercizioDipendenti;
import EsercizioDipendenti.Dipartimento;
import EsercizioDipendenti.Livello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dipendente D1 = new Dipendente("Matr", Dipartimento.PRODUZIONE );
        Dipendente.calcolaPaga(D1);
        Dipendente.calcolaPaga(D1, 20);

        Dipendente D2 = new Dipendente("Matr", Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente.calcolaPaga(D2);
        Dipendente.promuovi(D2);
        Dipendente.calcolaPaga(D2, 15);

        Dipendente D3 = new Dipendente("Matr", Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE);
        Dipendente.calcolaPaga(D3);
        Dipendente.promuovi(D3);
        Dipendente.calcolaPaga(D3, 25);


    }
}