package br.edu.ifpb.padroes.service.log;

public class FileLog implements LogHandler {

    public void log(String msg) {
        System.out.println("save data to database");
    }

}