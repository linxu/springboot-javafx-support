package de.felixroske.jfxsupport;

import javafx.scene.layout.Pane;
import javafx.stage.Window;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public abstract class BaseController {

    private Object params;

    public void close() {
        this.getWindow().hide();
    }

    public Window getWindow() {
        if (getCurrentView() == null) {
            return null;
        }
        Pane pane = (Pane) getCurrentView().getView();
        return pane.getScene().getWindow();
    }

    public abstract AbstractFxmlView getCurrentView();

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }
}
