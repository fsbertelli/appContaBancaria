package Pack01;

import java.util.Date;

public class Poupanca extends Conta {



    public Poupanca(){}
    public Poupanca(double saldo){
        this.setSaldo(saldo);
    }

    public Poupanca(int banco, int agencia, int tipoconta, int numero,
                    Date dataAbertura, Date dataFechamento, double saldo,
                    Cliente cliente){
        super( banco, agencia, tipoconta, numero,dataAbertura, dataFechamento, saldo, cliente);

    }

}
