package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MainForm extends JFrame implements KeyListener
{

    private JPanel panel1;
    private JLabel ResultLabel;
    private JButton ButtonOne;
    private JButton ButtonPlus;
    private JButton ButtonFour;
    private JButton ButtonSeven;
    private JButton ButtonPoint;
    private JButton ButtonSqrt;
    private JButton ButtonTwo;
    private JButton ButtonFive;
    private JButton ButtonEight;
    private JButton ButtonZero;
    private JButton ButtonPower;
    private JButton ButtonMultiply;
    private JButton ButtonThree;
    private JButton ButtonSix;
    private JButton ButtonNine;
    private JButton ButtonCalc;
    private JButton ButtonMinus;
    private JButton ButtonDivide;
    private JButton ButtonBack;

    private View view;

    boolean pressShift = false;



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SHIFT) {
            pressShift = true;
        }



        if (key == KeyEvent.VK_1) {
            view.ClickButton("ButtonOne");
        }

        if (key == KeyEvent.VK_2) {
            view.ClickButton("ButtonTwo");
        }
        if (key == KeyEvent.VK_3) {
            view.ClickButton("ButtonThree");
        }
        if (key == KeyEvent.VK_4) {
            view.ClickButton("ButtonFour");
        }
        if (key == KeyEvent.VK_5) {
            view.ClickButton("ButtonFive");
        }
        if (key == KeyEvent.VK_6) {
            view.ClickButton("ButtonSix");
        }
        if (key == KeyEvent.VK_7) {
            view.ClickButton("ButtonSeven");
        }
        if ((key == KeyEvent.VK_8)&&(!pressShift)) {
            view.ClickButton("ButtonEight");
        }
        if ((key == KeyEvent.VK_8)&&(pressShift)) {
            view.ClickButton("ButtonMultiply");
        }
        if (key == KeyEvent.VK_9) {
            view.ClickButton("ButtonNine");
        }
        if (key == KeyEvent.VK_0) {
            view.ClickButton("ButtonZero");
        }
        if (key == KeyEvent.VK_DIVIDE) {
            view.ClickButton("ButtonDivide");
        }
        if (key == KeyEvent.VK_MINUS) {
            view.ClickButton("ButtonMinus");
        }
        if (key == KeyEvent.VK_MULTIPLY) {
            view.ClickButton("ButtonMultiply");
        }
        if (key == KeyEvent.VK_PLUS) {
            view.ClickButton("ButtonPlus");
        }
        if ((key == KeyEvent.VK_EQUALS)&&(!pressShift)) {
            view.ClickButton("ButtonCalc");
        }
        if ((key == KeyEvent.VK_EQUALS)&&(pressShift)) {
            view.ClickButton("ButtonPlus");
        }
        if (key == KeyEvent.VK_ENTER) {
            view.ClickButton("ButtonCalc");
        }
        if (key == KeyEvent.VK_COMMA) {
            view.ClickButton("ButtonPoint");
        }
        if (key == KeyEvent.VK_SLASH) {
            view.ClickButton("ButtonDivide");
        }
        if (key == KeyEvent.VK_BACK_SPACE) {
            view.ClickButton("ButtonBack");
        }
//        if (key == KeyEvent.VK_P) {
//            view.ClickButton("ButtonOne");
//        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SHIFT)
        {
            pressShift = false;
        }
    }


    MainForm(View view)  {
        this.view = view;

        this.setSize(new Dimension(700, 800));
        setContentPane(panel1);
        setVisible(true);

        this.setFocusable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        //setFocusTraversalKeysEnabled(false);


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.ClickButton(((JButton)e.getSource()).getName());
            }
        };
        System.out.println(ButtonBack.getName());

        ButtonOne.setName("ButtonOne");
        ButtonOne.setFocusable(false);
        ButtonPlus.setName("ButtonPlus");
        ButtonPlus.setFocusable(false);
        ButtonFour.setName("ButtonFour");
        ButtonFour.setFocusable(false);
        ButtonSeven.setName("ButtonSeven");
        ButtonSeven.setFocusable(false);
        ButtonPoint.setName("ButtonPoint");
        ButtonPoint.setFocusable(false);
        ButtonSqrt.setName("ButtonSqrt");
        ButtonSqrt.setFocusable(false);
        ButtonTwo.setName("ButtonTwo");
        ButtonTwo.setFocusable(false);
        ButtonFive.setName("ButtonFive");
        ButtonFive.setFocusable(false);
        ButtonEight.setName("ButtonEight");
        ButtonEight.setFocusable(false);
        ButtonZero.setName("ButtonZero");
        ButtonZero.setFocusable(false);
        ButtonPower.setName("ButtonPower");
        ButtonPower.setFocusable(false);
        ButtonMultiply.setName("ButtonMultiply");
        ButtonMultiply.setFocusable(false);
        ButtonThree.setName("ButtonThree");
        ButtonThree.setFocusable(false);
        ButtonSix.setName("ButtonSix");
        ButtonSix.setFocusable(false);
        ButtonNine.setName("ButtonNine");
        ButtonNine.setFocusable(false);
        ButtonCalc.setName("ButtonCalc");
        ButtonCalc.setFocusable(false);
        ButtonMinus.setName("ButtonMinus");
        ButtonMinus.setFocusable(false);
        ButtonDivide.setName("ButtonDivide");
        ButtonDivide.setFocusable(false);
        ButtonBack.setName("ButtonBack");
        ButtonBack.setFocusable(false);


        ButtonOne.addActionListener(actionListener);
        ButtonPlus.addActionListener(actionListener);
        ButtonFour.addActionListener(actionListener);
        ButtonSeven.addActionListener(actionListener);
        ButtonPoint.addActionListener(actionListener);
        ButtonSqrt.addActionListener(actionListener);
        ButtonTwo.addActionListener(actionListener);
        ButtonFive.addActionListener(actionListener);
        ButtonEight.addActionListener(actionListener);
        ButtonZero.addActionListener(actionListener);
        ButtonPower.addActionListener(actionListener);
        ButtonMultiply.addActionListener(actionListener);
        ButtonThree.addActionListener(actionListener);
        ButtonSix.addActionListener(actionListener);
        ButtonNine.addActionListener(actionListener);
        ButtonCalc.addActionListener(actionListener);
        ButtonMinus.addActionListener(actionListener);
        ButtonDivide.addActionListener(actionListener);
        ButtonBack.addActionListener(actionListener);



    }


    void updateForm(String current)
    {
        ResultLabel.setText(current);
    }
}
