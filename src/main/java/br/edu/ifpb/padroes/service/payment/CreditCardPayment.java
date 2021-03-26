package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.payment.PaymentType;

public class CreditCardPayment implements PaymentType{

    public void pay()
    {
        System.out.println("Do credit card payment!");
    }

}