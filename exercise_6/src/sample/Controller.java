package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


public class Controller {
    public TextField txtRadius;
    public TextField txtHeight;
    public TextField txtThickess;
    public CheckBox chBoxSteel;
    public CheckBox chBoxStainlessSteel;
    public Button btnCalculate;
    public Button btnClear;
    public TextField txtResults;


    public void onBtnCalculate(ActionEvent actionEvent) {
        if (chBoxSteel.isSelected()||chBoxStainlessSteel.isSelected()){
            double radius = Double.parseDouble(txtRadius.getText());
            double height = Double.parseDouble(txtHeight.getText());
            double trickess = Double.parseDouble(txtThickess.getText());
            double capacity = radius*height*(trickess/10);
            double weight = capacity*0.079;
                txtResults.setText("Waga blachy: "+ weight + "g.\n");
                if (chBoxSteel.isSelected()){
                    double result1 = weight*2.9/1000;
                    txtResults.setText("Waga blachy: "+ weight + "g."+
                    "\nKoszt blachy stalowej : " + result1 + "zł." );
                }
                else {
                    double result2 = weight*11.5/1000;
                    txtResults.setText("Waga blachy: "+ weight + "g."+
                   " \nKoszt blachy stalowej nierdzewnej: " + result2 + "zł.");
                }
//                else {
//                    txtResults.setText("Wypełnij poprawnie wszytskie pola!!!");
//                }
        }


    }

    public void onChBoxSteel(ActionEvent actionEvent) {
        if (chBoxStainlessSteel.isSelected())
            chBoxStainlessSteel.setSelected(false);

    }

    public void onChBoxStainlessSteel(ActionEvent actionEvent) {
        if (chBoxSteel.isSelected())
            chBoxSteel.setSelected(false);
    }

    public void onBtnClear(ActionEvent actionEvent) {
        txtRadius.setText("");
        txtResults.setText("");
        txtHeight.setText("");
        txtThickess.setText("");
        chBoxSteel.setSelected(false);
        chBoxStainlessSteel.setSelected(false);

    }


}
