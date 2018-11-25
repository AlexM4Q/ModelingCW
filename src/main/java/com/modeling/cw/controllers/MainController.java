package com.modeling.cw.controllers;

import com.modeling.cw.constants.ExeMode;
import com.modeling.cw.constants.ModelingLevel;
import com.modeling.cw.entities.logic.MicroProgram;
import com.modeling.cw.entities.rows.Register16Row;
import com.modeling.cw.entities.rows.Register31Row;
import com.modeling.cw.entities.rows.Register3Row;
import com.modeling.cw.utils.MathUtils;
import com.modeling.cw.utils.UiUtils;
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

        UiUtils.prepareRegisterTable(a2Input_TV, () -> convertBinaryToDecimal(a2Input_TV, a10Input_TF));
        UiUtils.prepareRegisterTable(b2Input_TV, () -> convertBinaryToDecimal(b2Input_TV, b10Input_TF));
    }

    @FXML
    private void clear_B_action() {
        a2Input_TV.getItems().get(0).clear();
        a2Input_TV.refresh();
        a10Input_TF.clear();

        b2Input_TV.getItems().get(0).clear();
        b2Input_TV.refresh();
        b10Input_TF.clear();

        a2Process_TV.getItems().get(0).clear();
        a2Process_TV.refresh();

        b2Process_TV.getItems().get(0).clear();
        b2Process_TV.refresh();

        c2Result_TV.getItems().get(0).clear();
        c2Result_TV.refresh();
        c2Result_TF.clear();

        ch2Process_TV.getItems().get(0).clear();
        ch2Process_TV.refresh();
    }

    @FXML
    private void processControl_B_action() {
        final byte[] aBinary = a2Input_TV.getItems().get(0).toArray();
        final byte[] bBinary = b2Input_TV.getItems().get(0).toArray();
        final byte[] execute = new MicroProgram(aBinary, bBinary).execute();

        final double aOct = MathUtils.binaryToDouble(aBinary);
        final double bOct = MathUtils.binaryToDouble(bBinary);
        final float result = (float) (aOct * bOct);
        c2Result_TF.setText(String.valueOf(result));
        c2Result_TV.getItems().get(0).set(execute);
        c2Result_TV.refresh();
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

    private static void convertBinaryToDecimal(final TableView<Register16Row> table, final TextField textField) {
        textField.setText(String.valueOf(table.getItems().get(0).toInt()));
    }

}
