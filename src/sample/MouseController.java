package sample;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.time.LocalDateTime;

public class MouseController implements EventHandler{

    private Model model ;

    public MouseController(Model model){
        this.model = model;
    }

    @Override
    public void handle(Event event) {
        if(event.getEventType().equals(MouseEvent.MOUSE_PRESSED)){
            model.log("mouse pressd at :"+ LocalDateTime.now());
        }
    }
}
