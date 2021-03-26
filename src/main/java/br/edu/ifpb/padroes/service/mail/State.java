package br.edu.ifpb.padroes.service.mail;

public interface State {
    public void sendEmail(String message, String to);
}