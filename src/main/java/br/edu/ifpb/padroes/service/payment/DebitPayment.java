package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.payment.PaymentType;

public class DebitPayment implements PaymentType{

    public void pay()
    {
        System.out.println("Do debit payment!");
    }

}