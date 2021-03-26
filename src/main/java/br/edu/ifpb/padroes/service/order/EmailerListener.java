package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.service.mail.EmailNotification;

public class EmailerListener implements Listener {
    private EmailNotification emailNotification = new EmailNotification();

    public void update(String event)
    {
        this.emailNotification.sendMailNotification(event);
    }
}