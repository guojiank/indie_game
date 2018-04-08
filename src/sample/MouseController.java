package sample;

import javafx.event.Event;
import javafx.event.EventHandler;

public class MouseController implements EventHandler{

    private Model model ;

    public MouseController(Model model){
        this.model = model;
    }

    @Override
    public void handle(Event event) {

    }
}
