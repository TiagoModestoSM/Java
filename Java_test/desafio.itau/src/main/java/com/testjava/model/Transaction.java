

package com.testjava.model;

import java.time.OffsetDateTime;

public class Transaction {
    private double valor;
    private OffsetDateTime dataHora;

    public Transaction(final double valor, final OffsetDateTime dataHora){
        this.valor = valor;
        this.dataHora = dataHora;
    }
// não precisa passar o método set pois estamos usando o construtor passando os atributos
// usa-se somente o método get
    public double getValor(){
        return valor;
    }

    public OffsetDateTime getDataHora(){
        return dataHora;
    }
}
