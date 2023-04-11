package Pack01;

import java.util.Date;

public class Salario extends Conta {

    public Salario(){}
    public Salario(double saldo){
        this.setSaldo(saldo);
    }

    public Salario(int banco, int agencia, int tipoconta, int numero,
                   Date dataAbertura, Date dataFechamento, double saldo,
                   Cliente cliente) {
        super(banco, agencia, tipoconta, numero, dataAbertura, dataFechamento, saldo, cliente);
    }
}
