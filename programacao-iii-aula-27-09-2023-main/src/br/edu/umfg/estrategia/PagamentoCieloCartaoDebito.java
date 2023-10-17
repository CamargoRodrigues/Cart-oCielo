package br.edu.umfg.estrategia;

class PagamentoCieloCartaoDebito implements MeioPagamentoEstrategia {

    private String numeroCartao;
    private String cpf;
    private String cvv;
    private String dataValidade;

    public PagamentoCieloCartaoDebito(String numeroCartao, String cpf, String cvv, String dataValidade) {
        this.numeroCartao = numeroCartao;
        this.cpf = cpf;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    @Override
    public void processarPagamento(double valor) {
        // Realize as validações antes de prosseguir com o pagamento
        if (!ValidaDados.validarNumeroCartao(numeroCartao) ||
                !ValidaDados.validarCPF(cpf) ||
                !ValidaDados.validarCVV(cvv) ||
                !ValidaDados.validarDataValidade(dataValidade)) {
            System.out.println("Pagamento via Cartão de Débito");
        }else{
            System.out.println("Dados de pagamento inválidos. Pagamento não processado.");
        }
    }
}
