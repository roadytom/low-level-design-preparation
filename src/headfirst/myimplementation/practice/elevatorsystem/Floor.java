package headfirst.myimplementation.practice.elevatorsystem;

import headfirst.myimplementation.practice.elevatorsystem.display.Display;
import headfirst.myimplementation.practice.elevatorsystem.panel.HallPanel;


public class Floor {
    private Display display;
    private HallPanel panel;

    public boolean isTopMost() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean isBottomMost() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public HallPanel getPanel() {
        return panel;
    }

    public void setPanel(HallPanel panel) {
        this.panel = panel;
    }
}
