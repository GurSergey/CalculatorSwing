package com.company;

import javax.swing.*;

public class App {

    private View view;
    private Controller controller;
    private Model model;
    //Chart


    App() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        model = new Model();
        view = new View(controller);
        controller = new Controller(model, view);
        view.setController(controller);
    }
}
