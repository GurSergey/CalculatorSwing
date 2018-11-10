package com.company;

import javax.jws.WebParam;

public class Controller {
    Model model;
    View view;

    Controller (Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    public void ClickButton(String name)
    {
        name = name.replace("Button", "");
        model.inputCommand(Command.valueOf(name));
        updateView();
    }

    private void updateView()
    {
        if(!model.errorIsSet)
        {
            if(model.currentOperation==Operation.Empty)
            {
                view.updateView(model.currentNumString);
            }
            else
            {
                view.updateView(fmt(model.prevNum)+model.currentOperation.equivalent+model.currentNumString);
            }
        }
        else
        {
            view.updateView(model.errorMessage);
        }

    }
    private  String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }

}
