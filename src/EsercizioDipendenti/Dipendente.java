package EsercizioDipendenti;

public class Dipendente {
    public static double stipendioBase = 1000;
    private static String matricola;
    private static double stipendio;
    private static double importoOrarioStraordinario;

    public static EsercizioDipendenti.Livello Livello;
    public static EsercizioDipendenti.Dipartimento Dipartimento;

    public double getStipendioBase () {
        return stipendioBase;
    };
    public String getMatricola () {
        return  matricola;
    };
    public double getStipendio () {
       return  stipendio;
    };
    public double getImportoOrarioStraordinario () {
        return importoOrarioStraordinario;
    };
    public Livello getLivello () {
        return Livello;
    }

    public double setImportoOrarioStraordinario(double n) {
       return importoOrarioStraordinario = n;
    }

    public Dipartimento setDipartimento (Dipartimento dipartimento) {
        return Dipartimento = dipartimento;
    }
    public Livello setLivello (Livello livello) {
        return Livello = livello;
    }

    public Dipendente (String matr, Dipartimento dip) {
        this.matricola = matr + " " + Math.random() * 2;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.Livello = EsercizioDipendenti.Livello.OPERAIO;
        setDipartimento(dip);

    }

    public Dipendente (String matr, Livello liv, Dipartimento dip  ) {
        this.matricola = matr + " " + Math.random() * 2;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        setLivello(liv);
        setDipartimento(dip);
    }

    public static void stampaDatiDipendente () {
        System.out.println("Matricola: " + matricola +" "+  "Stipendio: " + "" + stipendio+"€" + " " + "Importo per straordinario: "+  importoOrarioStraordinario+"€"  + " " + "Livello: " + Livello + " " + "Dipartimento: " + Dipartimento);
    }

    public static void promuovi (Dipendente dipendente) {
        if (dipendente.Livello == EsercizioDipendenti.Livello.OPERAIO) {
            Livello = EsercizioDipendenti.Livello.IMPIEGATO;
            stipendio = stipendioBase * 1.2;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.IMPIEGATO) {
            Livello = EsercizioDipendenti.Livello.QUADRO;
            stipendio = stipendioBase * 1.5;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.QUADRO) {
            Livello = EsercizioDipendenti.Livello.DIRIGENTE;
            stipendio = stipendioBase * 2;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.DIRIGENTE) {
            System.out.println("Errore, non può essere promosso.");
        }
    }

    public static double calcolaPaga (Dipendente dipendente) {
        if (dipendente.Livello == EsercizioDipendenti.Livello.OPERAIO) {
            stipendio = stipendioBase;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.IMPIEGATO) {
            stipendio = stipendioBase * 1.2;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.QUADRO) {
            stipendio = stipendioBase * 1.5;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.DIRIGENTE) {
            stipendio = stipendioBase * 2;
            stampaDatiDipendente();
        }
        return stipendio;
    };

    public static double calcolaPaga (Dipendente dipendente, int ore) {
        if (dipendente.Livello == EsercizioDipendenti.Livello.OPERAIO) {
            stipendio = stipendioBase + (importoOrarioStraordinario * ore);
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.IMPIEGATO) {
            stipendio = (stipendioBase * 1.2) + (importoOrarioStraordinario * ore) ;
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.QUADRO) {
            stipendio = (stipendioBase * 1.5) + (importoOrarioStraordinario * ore);
            stampaDatiDipendente();
        } else if (dipendente.Livello == EsercizioDipendenti.Livello.DIRIGENTE) {
            stipendio = (stipendioBase * 2) + (importoOrarioStraordinario * ore);
            stampaDatiDipendente();
        }
        return stipendio;
    };

    };

