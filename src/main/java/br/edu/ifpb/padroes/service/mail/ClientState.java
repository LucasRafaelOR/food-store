package br.edu.ifpb.padroes.service.mail;

public class ClientState implements State {

    public void sendEmail(String message, String to)
    {
        System.out.println("send mail notification to ="+to);
    }
}
