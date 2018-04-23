package io.github.guojiank;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Controller implements EventHandler{

    private Model model ;

    public Controller(Model model){
        this.model = model;
    }

    @Override
    public void handle(Event event) {
        if(event.getEventType().equals(MouseEvent.MOUSE_PRESSED)){
//            model.log("mouse pressd at :"+ LocalDateTime.now());
        }
    }
}
