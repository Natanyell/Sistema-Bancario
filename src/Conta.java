class Conta {
    private int numero; // Número da conta
    private String agencia; // Agência da conta
    private double saldo; // Saldo da conta

    // Construtor que recebe o número da conta e a agência
    public Conta(int numero, String agencia) {
        this.numero = numero; // Define o número da conta
        this.agencia = agencia; // Define a agência da conta
        this.saldo = 0.0; // Inicializa o saldo da conta como zero
    }

    // Método para creditar um valor na conta
    public void creditar(double valor) {
        saldo += valor; // Incrementa o saldo da conta pelo valor creditado
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo; // Retorna o saldo atual da conta
    }

    // Método para obter a agência da conta
    public String getAgencia() {
        return agencia; // Retorna a agência da conta
    }
}