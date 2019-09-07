package com.levina.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainFormController {
    public TextField txtLength;
    public TextField txtWidth;
    public TextField txtRadius;
    public TextField txtHeight;
    public int rumus=0;
    public double surfacearea=0;
    public double volume=0;
    public void actionSubmit(ActionEvent actionEvent) {
        Alert a = new Alert(AlertType.INFORMATION);
        if (rumus==3){
        double radius = Double.valueOf(txtRadius.getText());
        surfacearea=(4*Math.PI*Math.pow(radius,2));
        volume=(4/3)*3.14*Math.pow(radius,3);
        a.setContentText("Surfacearea : "+ surfacearea + " Volume : " + volume);
        }
        else if (rumus==1){
            double width = Double.valueOf(txtWidth.getText());
            double height = Double.valueOf(txtHeight.getText());
            surfacearea = width*height;
            volume = 2*(width*height);
            a.setContentText("Surfacearea : "+ surfacearea + " Roundarea : " + volume);

        }
        else if (rumus==2){
            double radius = Double.valueOf(txtRadius.getText());
            double height = Double.valueOf(txtHeight.getText());
            surfacearea=2*Math.PI*radius*(radius+height);
            volume=Math.PI*Math.pow(radius,2)*height;
            a.setContentText("Surfacearea : "+ surfacearea + " Volume : " + volume);
        }


        a.show();
    }

    public int actionSquare(ActionEvent actionEvent) {
        txtHeight.setDisable(false);
        txtWidth.setDisable(false);
        txtRadius.setDisable(true);
        txtLength.setDisable(true);
        txtRadius.setText("");
        txtLength.setText("");
        txtHeight.setText("");
        rumus=1;
        return rumus;

    }

    public int actionBall(ActionEvent actionEvent) {
        txtRadius.setDisable(false);
        txtLength.setDisable(true);
        txtWidth.setDisable(true);
        txtHeight.setDisable(true);
        txtLength.setText("");
        txtWidth.setText("");
        txtHeight.setText("");
        txtRadius.setText("");
        rumus=3;
        return rumus;
    }

    public int actionTube(ActionEvent actionEvent) {
        txtRadius.setDisable(false);
        txtHeight.setDisable(false);
        txtLength.setDisable(true);
        txtWidth.setDisable(true);
        txtLength.setText("");
        txtWidth.setText("");
        txtRadius.setText("");
        txtHeight.setText("");
        rumus=2;
        return rumus;
    }
}
