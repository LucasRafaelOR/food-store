package br.edu.ifpb.padroes.service.log;

public class DatabaseLog implements LogHandler{
    
    public void log(String message) {
        if (type.equals(LogHandlerType.DATABASE)) {
            System.out.println("save data to database");
        
    }

}