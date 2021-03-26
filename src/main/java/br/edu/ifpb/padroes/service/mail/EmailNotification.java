package br.edu.ifpb.padroes.service.mail;

public class EmailNotification {
    private currentState : State;

    public EmailNotification(State s)
    {
        this.currentState = s;
    }

    public void setState(State s)
    {
        this.currentState = s;
    }

    public void sendMailNotification(String message, String to) {
        this.currentState.sendEmail(message, to);
    }


}
