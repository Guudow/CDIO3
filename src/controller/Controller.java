package controller;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Field;
import gui_main.GUI;

public class Controller {

    public void initializeGUI()
    {
        GUI_Field[] fields = GUI_FieldFactory.makeFields();
        GUI_Field[] fields2 = new GUI_Field[24];

        for(int i = 0; i < fields2.length; ++i) {
            fields2[i] = fields[i];
        }

        GUI gui = new GUI(fields2);
    }
}
