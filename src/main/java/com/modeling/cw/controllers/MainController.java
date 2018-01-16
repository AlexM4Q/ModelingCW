package com.modeling.cw.controllers;

import com.modeling.cw.constants.ExeMode;
import com.modeling.cw.constants.ModelingLevel;
import com.modeling.cw.models.rows.Register16Row;
import com.modeling.cw.models.rows.Register31Row;
import com.modeling.cw.models.rows.Register3Row;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public final class MainController {

    @FXML
    private TableView<Register16Row> a2Input_TV;
    @FXML
    private TextField a10Input_TF;
    @FXML
    private TableView<Register16Row> b2Input_TV;
    @FXML
    private TextField b10Input_TF;
    @FXML
    private TableView<Register16Row> a2Process_TV;
    @FXML
    private TableView<Register16Row> b2Process_TV;
    @FXML
    private TableView<Register31Row> c2Result_TV;
    @FXML
    private TextField c2Result_TF;
    @FXML
    private Button processControl_B;
    @FXML
    private TableView<Register3Row> ch2Process_TV;

    private ExeMode exeMode;

    private ModelingLevel modelingLevel;

    @FXML
    public void initialize() {
        a2Input_TV.getItems().add(new Register16Row());
        b2Input_TV.getItems().add(new Register16Row());
        a2Process_TV.getItems().add(new Register16Row());
        b2Process_TV.getItems().add(new Register16Row());
        c2Result_TV.getItems().add(new Register31Row());
        ch2Process_TV.getItems().add(new Register3Row());
    }

    @FXML
    private void clear_B_action() {

    }

    @FXML
    private void processControl_B_action() {

    }

    @FXML
    private void exeModeAuto_RB_action() {
        exeMode = ExeMode.AUTO;
        processControl_B.setText("Старт");
    }

    @FXML
    private void exeModeTact_RB_action() {
        exeMode = ExeMode.TACT;
        processControl_B.setText("Такт");
    }

    @FXML
    private void modelingLevelMicroProgram_RB_action() {
        modelingLevel = ModelingLevel.MICRO_PROGRAM;
    }

    @FXML
    private void modelingLevelUAOA_RB_action() {
        modelingLevel = ModelingLevel.UAOA;
    }

}
