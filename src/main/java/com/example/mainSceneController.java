package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainSceneController {

    @FXML
    private TextField sphereDiameterInput;

    @FXML
    private TextField surfaceField;

    @FXML
    private TextField volumeField;

    @FXML
    @SuppressWarnings("unused")
    void onClickCalcButton(ActionEvent event) {
        double diameter = Double.parseDouble(sphereDiameterInput.getText());

        Double volume = Sphere.calcVolume(diameter / 2);
        Double surface = Sphere.calcSurface(diameter / 2);

        volumeField.setText(volume.toString());
        surfaceField.setText(surface.toString());
    }

}
