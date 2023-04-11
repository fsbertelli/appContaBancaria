package Pack01;

import java.util.Date;

public class Corrente extends Conta {


    public Corrente(){}
    public Corrente(double saldo){
        this.setSaldo(saldo);
    }

    public Corrente(int banco, int agencia, int tipoconta, int numero,
                    Date dataAbertura, Date dataFechamento, double saldo,
                    Cliente cliente){
        super( banco, agencia, tipoconta, numero,dataAbertura, dataFechamento, saldo, cliente);

    }
}
