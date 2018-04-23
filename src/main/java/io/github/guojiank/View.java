package io.github.guojiank;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.*;


public class View extends Stage {
    Canvas canvas;
    GraphicsContext pen;
    double height;
    double width;
    Model m;
    Util u;

    public View(Model model) throws IOException {
        m = model;
        u = Util.getInstance();
        canvas = new Canvas();
        pen = canvas.getGraphicsContext2D();
        height = Double.parseDouble(u.get("window.height", "300d"));
        width = Double.parseDouble(u.get("window.width", "400d"));

        Group root = new Group();
        root.getChildren().add(canvas);
        canvas.widthProperty().bind(widthProperty());//绑定canvas的长宽，保持与stage的长宽一致
        canvas.heightProperty().bind(heightProperty());
        setScene(new Scene(root));
        setTitle(new RamdonTitle().getTitle());
        setHeight(height);
        setWidth(width);
        getIcons().add(new Image(this.getClass().getResourceAsStream("/me.jpg")));
        setResizable(false);
        show();//显示
    }

    public void clearCanvas() {
        pen.setFill(Color.WHITE);
        pen.fillRect(0, 0, width, height);
    }


    protected void draw() {

    }

    public void render() {
        clearCanvas();
        draw();
    }
}

