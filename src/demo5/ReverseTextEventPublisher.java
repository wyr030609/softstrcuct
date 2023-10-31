package demo5;

public class ReverseTextEventPublisher {
    private ReverseTextEventHandler eventHandler;

    public ReverseTextEventPublisher(ReverseTextEventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void publishReverseText(String text) {
        ReverseTextEvent event = new ReverseTextEvent(text);
        eventHandler.onReverseText(event);

    }
}
