package br.edu.ifpb.padroes.service.mail;

public class AdminState implements State {
    
    private String emailAdministration = "contact@food-store.com";

    public void sendEmail()
    {
        System.out.println("send mail notification to ="+emailAdministration);
    }
}
