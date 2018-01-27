package de.felixroske.jfxsupport;

import javafx.scene.layout.Pane;
import javafx.stage.Window;

public abstract class BaseController {

    public void close() {
        this.getWindow().hide();
    }

    public Window getWindow() {
        Pane pane = (Pane) getCurrentView().getView();
        return pane.getScene().getWindow();
    }

    public abstract AbstractFxmlView getCurrentView();

    public abstract void init();
}
