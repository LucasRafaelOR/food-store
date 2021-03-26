package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.payment.PaymentType;

public class PaymentService {
    
    public void doPayment(PaymentType type) throws Exception {
        if(type == null) throw new Exception("no payment method")
        this.type.pay()
    }

}
