package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

public class OrderManager {

    private OrderPublisher orderPublisher = new OrderPublisher();
    private PaymentService paymentService = new PaymentService();
    private Order order;
    


    public OrderManager(Order order) {
        this.order = order;

        this.orderPublisher.subscribe(new LoggingListener())
        this.orderPublisher.subscribe(new EmailerListener())
    }

    public void payOrder(PaymentType paymentType) {
        order.setStatus(Order.OrderStatus.IN_PROGRESS);
        try {
            paymentService.doPayment(paymentType);
            order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
            this.orderPublisher.notifyObservers(String.format("Order %d completed successfully", order.getId()));
        } catch (Exception e) {
            order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
            this.orderPublisher.notifyObservers(String.format("Order %d refused", order.getId()));
        }
    }

    public void cancelOrder() {
        order.setStatus(Order.OrderStatus.CANCELED);
        this.orderPublisher.notifyObservers(String.format("Order %d canceled", order.getId()));
    }

}
