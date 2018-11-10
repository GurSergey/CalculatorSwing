package com.company;

import javax.swing.*;

public class View {

    private MainForm form;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private Controller controller;

    View(Controller controller) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        this.controller = controller;
        form = new MainForm(this);
        //showGraphics();
    }


    public void updateView(String current)
    {
        form.updateForm(current);
    }


    public void ClickButton(String name)
    {
        controller.ClickButton(name);
    }


}
