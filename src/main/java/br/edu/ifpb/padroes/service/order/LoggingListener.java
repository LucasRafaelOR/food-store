package br.edu.ifpb.padroes.service.order;

public class LoggingListener implements Listener {
    private LogService logService = new LogService(new FileLog());

    public void update(String event)
    {
        logService.log(event);
    }
}