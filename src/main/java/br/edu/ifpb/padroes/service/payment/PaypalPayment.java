package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.payment.PaymentType;

public class PaypalPayment implements PaymentType{

    public void pay()
    {
        System.out.println("Do paypal payment!");
    }

}