package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    @FXML
    public TextField talDisplay;
    ArrayList<String> numbers = new ArrayList<String>();
    public void plusMetode(ActionEvent actionEvent) {
        System.out.println("Plus blev trykket");
        String s = talDisplay.getText();
        numbers.add(s);
        talDisplay.clear();





    }

    public void equalsMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbers.add(s);
        int resultat = 0;
        talDisplay.clear();
        for (String number:numbers) {
            System.out.println(number);
            resultat += Integer.parseInt(number);
        }
        System.out.println("Det bliver: "+ Integer.toString(resultat));
        talDisplay.setText(Integer.toString(resultat));
    }
}
