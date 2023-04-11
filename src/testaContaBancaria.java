import Pack01.*;

public class testaContaBancaria {
    public static void main(String[] args) {

        Conta conta01 = new Conta(100);
        Conta conta02 = new Conta(150);

        System.out.printf("Saldo conta 01 antes da tranferencia = %.2f\n ",conta01.getSaldo());
        System.out.printf("Saldo conta 02 antes da tranferencia = %.2f\n ",conta02.getSaldo());

        conta01.transfere(conta02, 50);

        System.out.printf("Saldo conta 01 depois da tranferencia = %.2f\n ",conta01.getSaldo());
        System.out.printf("Saldo conta 02 depois da tranferencia = %.2f\n ",conta02.getSaldo());
    }
}