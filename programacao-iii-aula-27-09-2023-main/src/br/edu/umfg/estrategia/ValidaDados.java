package br.edu.umfg.estrategia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidaDados {
    public static boolean validarNumeroCartao(String numeroCartao) {
        // Implemente a lógica de validação do número do cartão aqui
        // Pode ser usando expressões regulares, verificando a bandeira, etc.
        return numeroCartao.matches("^\\d{16}$"); // Exemplo: 16 dígitos
    }

    // Método para validar o CPF do cliente
    public static boolean validarCPF(String cpf) {
        // Implemente a lógica de validação do CPF aqui
        // Você pode usar bibliotecas de validação de CPF ou implementar sua própria validação.
        // Retorne true se o CPF for válido, caso contrário, retorne false.
        return true; // Exemplo simplificado
    }

    // Método para validar o CVV (código de segurança) do cartão
    public static boolean validarCVV(String cvv) {
        // Implemente a lógica de validação do CVV aqui
        // Verifique se o CVV possui exatamente 3 caracteres.
        return cvv.matches("^\\d{3}$"); // Exemplo: 3 dígitos
    }

    // Método para validar a data de validade do cartão
    public static boolean validarDataValidade(String dataValidade) {
        // Implemente a lógica de validação da data de validade aqui
        // Você pode usar bibliotecas de manipulação de datas para facilitar isso.
        // Verifique se a data de validade é maior que a data atual.
        // Exemplo simplificado:
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
        Date dataAtual = new Date();
        try {
            Date dataInformada = dateFormat.parse(dataValidade);
            return dataInformada.after(dataAtual);
        } catch (ParseException e) {
            return false;
        }
    }
}
