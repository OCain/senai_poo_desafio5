public class Consumidor {

    //Atributos
    private String nome;
    private int[] fiados;
    private int fiadosPosicao = 0;
    private String telefone;

    //Construtor
    public Consumidor(String nome) {
        this.nome = nome;
        this.fiados = new int[10];
    }

    //Métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void registrarFiado(int valor) {
        this.fiados[fiadosPosicao] = valor;
        fiadosPosicao++;
    }

    public int getFiado() {
        int total = 0;
        for (int fiado : fiados) {
            total += fiado;
        }
        return total;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
