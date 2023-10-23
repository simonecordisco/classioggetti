//Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome,
// cognome ed identificativo.
  //      Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
    //    Nel main dichiarare un oggetto di tipo Studente.
public class studente {
    private String nome;


    private String cognome;

    private final String identificativo;
    public studente(String nome, String cognome, String identificativo){
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public String getIdentificativo(){
        return identificativo;
    }

    @Override
    public String toString() {
        return "studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", identificativo='" + identificativo + '\'' +
                '}';
    }

}
