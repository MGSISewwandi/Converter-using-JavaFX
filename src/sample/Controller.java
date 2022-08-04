package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private AnchorPane pane;

    @FXML
    private Button btn1;

    @FXML
    private Button btn6;

    @FXML
    private Button btn5;

    @FXML
    private Button btn4;

    @FXML
    private Button btn2;

    @FXML
    private TextField tf1;

    @FXML
    private Button btnClear;

    @FXML
    private Button maxbtn;

    @FXML
    private Button btnClose;

    @FXML
    private Button minbtn;

    @FXML
    private Button btn7;

    @FXML
    void Celsius(ActionEvent event) { //convert fahrenheit to celsius
        try{
            String number = tf1.getText().trim();
            double num = Double.parseDouble(number);
            double convert = ((num-32)*5)/9;
            String s = Double.toString(convert);
            tf1.setText(s+" °C");
        }
        catch (NumberFormatException e) {
            tf1.setText("Please Enter a Number");
        }
    }

    @FXML
    void Fahrenheit(ActionEvent event) { //convert celsius to fahrenheit
        try{
            String number = tf1.getText().trim();
            double num = Double.parseDouble(number);
            double convert = (num*9/5)+32;
            String s = Double.toString(convert);
            tf1.setText(s+" °F");
        }
        catch (NumberFormatException e) {
            tf1.setText("Please Enter a Number");
        }
    }

    @FXML
    void Inr(ActionEvent event) { //convert LKR to INR
        try{
            String number = tf1.getText().trim();
            double num = Double.parseDouble(number);
            double convert = num*0.37;
            String s = Double.toString(convert);
            tf1.setText(num+"LKR = "+s+"INR");
        }
        catch (NumberFormatException e) {
            tf1.setText("Please Enter a Number");
        }
    }

    @FXML
    void Km(ActionEvent event) { //convert m to Km
        try {
            String number = tf1.getText().trim();
            double num = Double.parseDouble(number);
            double convert = num / 1000;
            String s = Double.toString(convert);
            tf1.setText(num + "m = " + s + "Km");
        } catch (NumberFormatException e) {
            tf1.setText("Please Enter a Number");
        }
    }

    @FXML
    void Meter(ActionEvent event) { //convert Km to m
        try {
            String number = tf1.getText().trim();
            double num = Double.parseDouble(number);
            double convert = num * 1000;
            String s = Double.toString(convert);
            tf1.setText(num + "Km = " + s + "m");
        } catch (NumberFormatException e) {
            tf1.setText("Please Enter a Number");
        }
    }

    @FXML
    void Volume(ActionEvent event) { //convert to volume
        try {
            String number = tf1.getText().trim();
            double num = Double.parseDouble(number);
            double convert = num * num * num;
            String s = Double.toString(convert);
            tf1.setText(s + "m³");

        } catch (NumberFormatException e) {
            tf1.setText("Please Enter a Number");
        }
    }

    @FXML
    void actionPerformed(ActionEvent event) { //clear button
        tf1.clear();
    }

    @FXML
    void handleCloseButtonAction(ActionEvent event) { //close button
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleMaxButtonAction(ActionEvent event) { //maximize button
        Stage stage = null;
        stage = (Stage) pane.getScene().getWindow();
        if(stage.isMaximized())
            stage.setMaximized(false);
        else
            stage.setMaximized(true);
    }

    @FXML
    void handleMinButtonAction(ActionEvent event) { //minimize button
        Stage stage = null;
        stage = (Stage) pane.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void initialize() {


    }
}
