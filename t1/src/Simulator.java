import java.util.ArrayList;

public class Simulator {
    private int chegada;
    private int tempo_atendimento;
    private int servidores;
    private int capacidade;
    private int fila = 0;

    private ArrayList list;


    public Simulator(int chegada, int tempo_atendimento, int servidor, int capacidade) {
        this.chegada = chegada;
        this.tempo_atendimento = tempo_atendimento;
        this.servidores = servidores;
        this.capacidade = capacidade;
        this.list = new ArrayList();
    }

    public void chegada() {
        /**
         * contabiliza tempo
            se FILA < 3
            ◦ FILA++
            ◦ se FILA <= 1
            agenda SAIDA(T+rnd(3..6))
            agenda CHEGADA(T+rnd(1..2))
         * 
         */

        if(fila < capacidade) {
            fila++;
            if(fila <= servidores) {

            }
        }

    }

    public void saida() {

    }
    /**
     * @Param valor a e b para determinar intervalo do numero pseudo aleatório
     * @Return valor de conversao do tempo de atendimento na fila
     */
    public double conversao(double a, double b) {
        double rnd = PseudoRandomNumberGenerator.generateRandomNumber(a, b);
        return b - a * rnd + a; 
    }
}