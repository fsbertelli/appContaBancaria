package Pack01;

import java.util.Date;

public class Conta {

    private int banco;          // código do banco
    private int agencia;        // código da agência
    private int tipoconta;      // 1 conta corrente 2 conta poupança 3 conta salário
    protected int numero;         // numero da conta
    private Date dataAbertura;  // data da abertura da conta
    private Date dataFechamento;// data do fechamento da conta
    protected double saldo;       // saldo da conta

    //private String nome;        // nome do cliente

    private Cliente cliente;


    public Conta(){}

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public Conta(int banco, int agencia, int tipoconta, int numero,
                 Date dataAbertura, Date dataFechamento, double saldo,
                 Cliente cliente){
        this.banco          = banco;
        this.agencia        = agencia;
        this.tipoconta      = tipoconta;
        this.numero         = numero;
        this.dataAbertura   = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.saldo          = saldo;
        this.cliente        = cliente;
    }
    public void addCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transfere(Conta contaDestino, double valor){
        if (this.saldo < valor) {
            System.out.println("Saldo insulficiente");
        } else if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            contaDestino.saldo = contaDestino.saldo + valor;
        }
    }
}
