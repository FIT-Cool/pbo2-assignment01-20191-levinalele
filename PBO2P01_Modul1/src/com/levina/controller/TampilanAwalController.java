package com.levina.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class TampilanAwalController {
    public ImageView imageuser;
    public ImageView imagecomputer;
    public int UserScore=0;
    public int WinScore=0;
    public int DrawScore=0;
    public int Losescore;
    public TextField txtWin;
    public TextField txtDraw;
    public TextField txtLose;

    public void papperAction(ActionEvent actionEvent) {
        imageuser.setImage(new Image("paper.jpg"));
        UserScore=1;
        Random();
    }

    public void rockAction(ActionEvent actionEvent) {
        imageuser.setImage(new Image("rock.jpg"));
        UserScore=2;
        Random();

    }

    public void scissorsAction(ActionEvent actionEvent) {
        imageuser.setImage(new Image("scissors.jpg"));
        UserScore=3;
        Random();
    }

    public void Random(){
        Random random = new Random();
        int nilai = random.nextInt(3);

        if(nilai==0){
            imagecomputer.setImage(new Image("paper.jpg"));
        }
        else if(nilai == 1){
            imagecomputer.setImage(new Image("rock.jpg"));
        }
        else if(nilai==2){imagecomputer.setImage(new Image("scissors.jpg"));}

        if(nilai==0){
            if(UserScore==1){
                DrawScore+=1;
            }
            else if(UserScore==2){
                Losescore+=1;
            }
            else if(UserScore==3){
                WinScore+=1;
            }
        }
        else if(nilai == 1){
            if(UserScore==1){
                WinScore+=1;
            }
            else if(UserScore==2){
                DrawScore+=1;
            }
            else if(UserScore==2){
                Losescore+=1;
            }
        }
        else if(nilai == 2){
            if(UserScore==1){
                Losescore+=1;
            }
            else if(UserScore==2){
                WinScore+=1;
            }
            else if(UserScore==2){
                DrawScore+=1;
            }
        }

        txtWin.setText(String.valueOf(WinScore));
        txtLose.setText(String.valueOf(Losescore));
        txtDraw.setText(String.valueOf(DrawScore));









    }

    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
